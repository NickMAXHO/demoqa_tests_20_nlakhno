package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.RandomUtils.getRandomEmail;
import static com.demoqa.utils.RandomUtils.getRandomString;

public class StudentRegFormPageObjectAndDataTestAndRndmUtils extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successRegFormTest() {

        String firstName = getRandomString(10),
               lastName = getRandomString(10),
               userEmail = getRandomEmail();


        registrationPage.openPage()
                .bannerRemove()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmailInput(userEmail)
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
                .checkResultTable("Student Name", firstName + " " + lastName)
                .checkResultTable("Student Email", userEmail)
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