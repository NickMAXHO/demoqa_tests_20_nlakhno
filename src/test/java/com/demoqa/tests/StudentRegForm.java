package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void successRegFormTest() {
        String thanksText = "Thanks for submitting the form";


        open("/automation-practice-form");

        $("#firstName").setValue("Rajesh");
        $("#lastName").setValue("Koothrappali");
        $("#userEmail").setValue("Koothrappali@Rajesh.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9075556785");
        $("#dateOfBirth-wrapper").$("#dateOfBirthInput").click();
        $("#dateOfBirth-wrapper").$(".react-datepicker__month-select").selectOption(5);
        $("#dateOfBirth-wrapper").$(".react-datepicker__year-select").click();
        $("#dateOfBirth-wrapper").$(byText("1990")).click();
        $(".react-datepicker__day--029").click();
        $("#subjectsInput").sendKeys("co");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").sendKeys("m");
        $("#subjectsInput").pressEnter();
        $("#subjectsInput").sendKeys("e");
        $("#subjectsInput").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("manWithNoName.jpg");
        $("#currentAddress").setValue("Some address 1");
        $("#stateCity-wrapper").$("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#stateCity-wrapper").$("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(byText(thanksText)).shouldBe(Condition.visible);
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Rajesh Koothrappali"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("Koothrappali@Rajesh.com"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("9075556785"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("29 May,1990"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("Computer Science, Maths, English"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Reading, Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("manWithNoName.jpg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Some address 1"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Delhi"));
    }
}