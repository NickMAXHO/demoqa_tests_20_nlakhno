package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.components.CalendarComponent;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegFormPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successRegFormTest() {
        registrationPage.openPage()
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
                        .checkResultTable("Student Name","Rajesh Koothrappali")
                        .checkResultTable("Student Email", "Koothrappali@Rajesh.com")
                        .checkResultTable("Gender", "Male")
                        .checkResultTable("Mobile", "9075556785")
                        .checkResultTable("Date of Birth", "05 June,1990")
                        .checkResultTable("Subjects", "Computer Science, Maths, English")
                        .checkResultTable("Hobbies", "Reading, Music")
                        .checkResultTable("Picture","manWithNoName.jpg")
                        .checkResultTable("Address", "Some address 1")
                        .checkResultTable("State and City", "NCR Delhi");

    }

}