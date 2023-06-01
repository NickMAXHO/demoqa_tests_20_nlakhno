package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SelenideHomework1 {

    @Test
    void verifyJUnit5CodeExample(){
        Configuration.browserSize="1920x1080";

        // - Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //- Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").sendKeys("sof");
        $("a[href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(Condition.text("SoftAssertions"));
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("a[href='/selenide/selenide/wiki/SoftAssertions']").click();
        $("#user-content-3-using-junit5-extend-test-class").isDisplayed();
    }
}
