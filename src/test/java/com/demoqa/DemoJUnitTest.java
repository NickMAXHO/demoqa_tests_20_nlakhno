package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DemoJUnitTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("#### @BeforeAll");
        Configuration.browser = "chrome";
    }



    @Test
    void firstTest(){
        System.out.println("#### @Test 1st");
        int result = 2+2;
        Assertions.assertTrue(result == 4);
    }

    @Test
    void secondTest(){
        System.out.println("#### @Test 2nd");
        int result1 = 2+2;
        Assertions.assertTrue(result1 == 4);
    }
}
