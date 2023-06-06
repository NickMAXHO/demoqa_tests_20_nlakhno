package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class StudentRegFormPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successRegFormTest() {
        registrationPage.openPage()
                .bannerRemove()
                .setFirstName("Rajesh")
                .setLastName("Koothrappali")
                .setUserEmailInput("Koothrappali@Rajesh.com")
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
                .checkResultTable("Student Name", "Rajesh Koothrappali")
                .checkResultTable("Student Email", "Koothrappali@Rajesh.com")
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