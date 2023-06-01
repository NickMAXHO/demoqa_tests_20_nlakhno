package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop(){

        // открыть главную страницу
        open("https://github.com");
        // ввести в поле поиска selenide и нажать enter
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        // кликнуть на первый репозиторий в списке найденных
        $$("ul.repo-list li").first().$("a").click();
        // проверить заголовок: selenide/selenide
        $("a[href='/selenide/selenide']").shouldHave(Condition.text("selenide/selenide"));
    }
}
