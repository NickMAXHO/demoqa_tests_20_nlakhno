package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    static Faker faker = new Faker();

    public static int getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomGender(){
        String[] genders = {"Male", "Female", "Other"};
        return getRandomItemFromArray(genders);
    }

    private static String getRandomItemFromArray(String[] values){
        int index = getRandomInt(0,values.length - 1);

        return values[index];
    }

    public static String getRandomSubject() {
        String[] subjects = {"Math", "English", "Chemistry", "Civics", "Computer Science", "Arts", "Physics", "Economics"};
        return faker.options().option(subjects);
    }

    public static String getRandomHobby() {
        String[] hobby = {"Sports", "Reading", "Music"};
        return faker.options().option(hobby);
    }

    public static String getRandomMonth() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(month);
    }

    public static String getRandomState() {
        String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(state);
    }

    public static String getRandomCity(String state) {
        switch (state) {
            case "NCR":
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(city);
            case "Uttar Pradesh":
                String[] city1 = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(city1);
            case "Haryana":
                String[] city2 = {"Karnal", "Panipat"};
                return faker.options().option(city2);
            case "Rajasthan":
                String[] city3 = {"Jaipur", "Jaiselmer"};
                return faker.options().option(city3);
            default:
                return null;
        }
    }
}

