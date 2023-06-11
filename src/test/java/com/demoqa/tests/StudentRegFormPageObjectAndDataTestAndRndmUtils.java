package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.demoqa.utils.RandomUtils.*;

public class StudentRegFormPageObjectAndDataTestAndRndmUtils extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker(new Locale("en-US"));

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            currentAddress = faker.address().fullAddress(),
            gender = getRandomGender(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = String.format("%02d", faker.number().numberBetween(1, 28)),
            month = getRandomMonth(),
            year = String.valueOf(getRandomInt(1950, 2003)),
            state = getRandomState(),
            city = getRandomCity(state),
            picName = "manWithNoName.jpg",
            userHobby = getRandomHobby(),
            userSubject = getRandomSubject();

    @Test
    void successRegFormTest() {

                registrationPage.openPage()
                .bannerRemove()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmailInput(userEmail)
                .setGender(gender)
                .setUserNumber(userNumber)
                .setBirthDay(day, month, year)
                .setSubjects(userSubject)
                .setHobby(userHobby)
                .uploadPicture(picName)
                .setCurrentAddress(currentAddress)
                .setStateAndCity(state, city)
                .submit();

        registrationPage.thanksModalAppeared()
                .checkResultTable("Student Name", firstName + " " + lastName)
                .checkResultTable("Student Email", userEmail)
                .checkResultTable("Gender", gender)
                .checkResultTable("Mobile", userNumber)
                .checkResultTable("Date of Birth", day + " " + month + "," + year)
                .checkResultTable("Subjects", userSubject)
                .checkResultTable("Hobbies", userHobby)
                .checkResultTable("Picture", picName)
                .checkResultTable("Address", currentAddress)
                .checkResultTable("State and City", state + " " + city);

    }
}