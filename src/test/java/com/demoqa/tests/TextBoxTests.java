package com.demoqa.tests;

import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase{
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void successTest(){

        textBoxPage.openPage()
                   .setFullName("Frol","Kalistratov")
                   .setUserEmail("Kalistratov@frol.com")
                   .setCurrentAddress("Some address 1")
                   .setPermanentAddress("Another address 1")
                   .clickSubmitButton();

        textBoxPage.verifyResult("Frol Kalistratov", "Kalistratov@frol.com",
                "Some address 1", "Another address 1");
    }
}
