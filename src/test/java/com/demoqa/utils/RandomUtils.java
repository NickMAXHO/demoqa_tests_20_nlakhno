package com.demoqa.utils;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static String getRandomString(int len){
//        static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        static SecureRandom rnd = new SecureRandom();

        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String getRandomEmail(){
        return getRandomString(10) + "@qa.guru";
    }

    public static String getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1)
    }

    public static String getRandomPhone(){
        return String.format("+%s (%s) %s - %s - %s", getRandomInt(1,9), getRandomInt(111, 999), getRandomInt(111, 999),
                getRandomInt(11,99), getRandomPhone(11 90));
    }
    public static String getRandomGender(){
        String[] genders = {"Male", "Female", "Other"};
        return getRandomItemFromArray(genders);
    }

    private static String getRandomItemFromArray(String[] values){
        int index = getRandomInt(0,values.length - 1)

        return values[index];
    }
}

