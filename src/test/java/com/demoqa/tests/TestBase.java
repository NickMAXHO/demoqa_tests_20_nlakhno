package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
//
//            String
//            firstName,
//            lastName,
//            userEmail;
//
//
//
//    @BeforeEach
//    void prepareTestData(){
//            firstName = "Rajesh";
//            lastName = "Koothrappali";
//            userEmail = "Koothrappali@Rajesh.com";
//    }

    RegistrationPage registrationPage = new RegistrationPage();
    TextBoxPage textBoxPage = new TextBoxPage();
    TestData testData = new TestData();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
}
