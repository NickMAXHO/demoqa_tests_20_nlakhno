package com.demoqa.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableResultComponent {

    SelenideElement tableResult = $(".table-responsive");

    public void tableCheck(String fieldName, String value){
        tableResult.$(byText(fieldName)).parent().shouldHave(text(value));
    }
}
