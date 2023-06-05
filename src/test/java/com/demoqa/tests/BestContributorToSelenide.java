package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class BestContributorToSelenide {

    @Test
    void andreiSolntsevShouldBeTheFirstContributor(){
        Configuration.browserSize="1920x1080";

        // открыть главную страницу
        open("https://github.com/selenide/selenide");
        // подвести курсор к первому аватару из блока contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest("h2").sibling(0).$$("li").first().hover();
        // проверка: во всплывающем окне есть текст "Andrei Solntsev"
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
      }
}
