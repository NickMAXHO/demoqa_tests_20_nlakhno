package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentRegFormPageObjectAndDataTest extends TestBase {

//    String
//            firstName = "Rajesh",
//            lastName = "Koothrappali",
//            userEmail = "Koothrappali@Rajesh.com";
//        String
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

    @Test
    void successRegFormTest() {



        registrationPage.openPage()
                .bannerRemove()
                .setFirstName(TestData.firstName)
                .setLastName(TestData.lastName)
                .setUserEmailInput(TestData.userEmail)
                .setGender("Male")
                .setUserNumber("9075556785")
                .setBirthDay("05", "June", "1990")
                .setSubjects("Computer Science")
                .setSubjects("Maths")
                .setSubjects("English")
                .setHobby("Reading")
                .setHobby("Music")
                .uploadPicture("manWithNoName.jpg")
                .setCurrentAddress("Some address 1")
                .setStateAndCity("NCR", "Delhi")
                .submit();

        registrationPage.thanksModalAppeared()
                .checkResultTable("Student Name", TestData.firstName + " " + TestData.lastName)
                .checkResultTable("Student Email", TestData.userEmail)
                .checkResultTable("Gender", "Male")
                .checkResultTable("Mobile", "9075556785")
                .checkResultTable("Date of Birth", "05 June,1990")
                .checkResultTable("Subjects", "Computer Science, Maths, English")
                .checkResultTable("Hobbies", "Reading, Music")
                .checkResultTable("Picture", "manWithNoName.jpg")
                .checkResultTable("Address", "Some address 1")
                .checkResultTable("State and City", "NCR Delhi");

    }
}