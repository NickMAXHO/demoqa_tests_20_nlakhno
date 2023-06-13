package com.demoqa.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

import static com.demoqa.utils.RandomUtils.*;

public class TestData {

    static String firstNameWithoutRandom = "Rajesh";
    static String lastNameWithoutRandom = "Koothrappali";
    static String userEmailWithoutRandom = "Koothrappali@Rajesh.com";

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

}
