package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class studentRegForm {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void successRegFormTest(){

        String userpicPath = "src/Files/manWithNoName.jpg";
        String thanksText = "Thanks for submitting the form";


        open("/automation-practice-form");

        $("#firstName").setValue("Rajesh");
        $("#lastName").setValue("Koothrappali");
        $("#userEmail").setValue("Koothrappali@Rajesh.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("9075556785");
        $("#dateOfBirthInput").sendKeys(Keys.chord(Keys.CONTROL, "a"));
        $("#dateOfBirthInput").sendKeys("28 May 1990");
        $("#dateOfBirthInput").pressEnter();
        $("#subjectsInput").sendKeys("c");
        $("#subjectsInput").sendKeys("o");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").sendKeys("m");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").sendKeys("e");
        $("#subjectsInput").pressEnter();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File(userpicPath));
        $("#state").click();
        $(byText("NCR")).click();
        $(byText("Select City")).click();
        $(byText("Delhi")).click();
        $("#currentAddress").setValue("Some address 1");
        $("#submit").click();

        $(byText(thanksText)).shouldBe(Condition.visible);
        $(byText("Rajesh Koothrappali")).shouldBe(Condition.visible);
        $(byText("Koothrappali@Rajesh.com")).shouldBe(Condition.visible);
        $(byText("Male")).shouldBe(Condition.visible);
        $(byText("9075556785")).shouldBe(Condition.visible);
        $(byText("28 May,1990")).shouldBe(Condition.visible);
        $(byText("Computer Science")).shouldBe(Condition.visible);
        $(byText("Maths")).shouldBe(Condition.visible);
        $(byText("English")).shouldBe(Condition.visible);
        $(byText("Reading, Music")).shouldBe(Condition.visible);
        $(byText("manWithNoName.jpg")).shouldBe(Condition.visible);
        $(byText("Some address 1")).shouldBe(Condition.visible);
        $(byText("NCR Delhi")).shouldBe(Condition.visible);
    }
}
