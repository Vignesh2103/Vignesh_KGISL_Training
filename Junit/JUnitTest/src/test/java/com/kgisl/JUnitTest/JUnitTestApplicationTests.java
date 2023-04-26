package com.kgisl.JUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class JUnitTestApplicationTests {

    static App app = new App();

    @BeforeAll
    public static void beforeClass() {
        app.beforeClassMethod();
    }

    @BeforeEach
    public void before() {
        app.beforeMethod();
    }

    @Test
    void contextLoads() {
        // Test method body
		app.run();
    }

    @DisplayName("Test for Calculator Test")
    @Test
    public void calculatorTest() {
        int expected = 10;
        int actual = app.add(5, 5);
        assertEquals(expected, actual);
        System.out.println("Expected " + expected);    
        System.out.println("Actual " + actual);    
    }

    @Disabled
    public void ignore() {
        app.ignoreMethod();
    }

    @AfterEach    
    public void after() {
        app.afterMethod();
    }

    @AfterAll
    public static void afterClass() {
        app.afterClassMethod();
    }

}
