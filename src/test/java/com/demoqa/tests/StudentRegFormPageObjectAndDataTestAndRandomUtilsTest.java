package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class StudentRegFormPageObjectAndDataTestAndRandomUtilsTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successRegFormTest() {

        registrationPage.openPage()
                .bannerRemove()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmailInput(testData.userEmail)
                .setGender(testData.gender)
                .setUserNumber(testData.userNumber)
                .setBirthDay(testData.day, testData.month, testData.year)
                .setSubjects(testData.userSubject)
                .setHobby(testData.userHobby)
                .uploadPicture(testData.picName)
                .setCurrentAddress(testData.currentAddress)
                .setStateAndCity(testData.state, testData.city)
                .submit();

        registrationPage.thanksModalAppeared()
                .checkResultTable("Student Name", testData.firstName + " " + testData.lastName)
                .checkResultTable("Student Email", testData.userEmail)
                .checkResultTable("Gender", testData.gender)
                .checkResultTable("Mobile", testData.userNumber)
                .checkResultTable("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResultTable("Subjects", testData.userSubject)
                .checkResultTable("Hobbies", testData.userHobby)
                .checkResultTable("Picture", testData.picName)
                .checkResultTable("Address", testData.currentAddress)
                .checkResultTable("State and City", testData.state + " " + testData.city);

    }
}