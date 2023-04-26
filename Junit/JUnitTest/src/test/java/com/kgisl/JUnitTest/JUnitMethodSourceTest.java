package com.kgisl.JUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class JUnitMethodSourceTest {

    @DisplayName("Testing stringProvider")
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithExplictLocalMethodSource(String argument) {
        assertNotNull(argument);
        System.out.println(argument);
    }

    Stream<String> stringProvider() {
        return Stream.of("apple", "Banana");

    }

    @DisplayName("Testing Ranges")
    @ParameterizedTest
    @MethodSource({ "range1", "range2" })
    void testRangeMethodSource(int range) {
        assertNotEquals(9, range);
        System.out.println(range);

    }

    IntStream range1() {
        return IntStream.range(1, 20).skip(10);

    }

    IntStream range2() {
        return IntStream.range(1, 20).skip(10);

    }


    // @DisplayName("Testing List and String Provider")
    // @ParameterizedTest
    // @MethodSource("stringListProvider")
    // void testStringListProvider(String str, int num,List<String>){
    //     assertEquals(5,str.length());
    //     asserTrue(num>=1 && num<=2 );
    //     asserEquals(2,list.size());

    // }

    // static stringProvider(String str, int num,List<String>){

    // }

  
}
