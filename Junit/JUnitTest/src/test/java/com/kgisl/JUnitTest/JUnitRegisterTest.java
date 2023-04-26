package com.kgisl.JUnitTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class JUnitRegisterTest
 {

    @RegisterExtension
    static final IntegerResolver integerResolver = new IntegerResolver();

    @ParameterizedTest
    @MethodSource("factoryMethodWithArguments")
	public void testMethodWithArguments(String argument) {
        assertTrue(argument.startsWith("2"));
        System.out.println(argument);
    }

    static Stream<Arguments> factoryMethodWithArguments(int quantity) {
        return Stream.of(
                arguments(quantity + " apples"),
                arguments(quantity + " lemons"));
    }

    static class IntegerResolver implements ParameterResolver {

        @Override
        public boolean supportsParameter(ParameterContext parameterContext,
                ExtensionContext extensionContext) {

            return parameterContext.getParameter().getType() == int.class;
        }

        @Override
        public Object resolveParameter(ParameterContext parameterContext,
                ExtensionContext extensionContext) {

            return 2;
        }

    }

    
}
