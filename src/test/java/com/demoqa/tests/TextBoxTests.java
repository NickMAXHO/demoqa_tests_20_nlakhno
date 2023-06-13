package com.demoqa.tests;

import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase{

    @Test
    void successTest(){

        textBoxPage.openPage()
                   .bannerRemove()
                   .setFullName("Frol","Kalistratov")
                   .setUserEmail("Kalistratov@frol.com")
                   .setCurrentAddress("Some address 1")
                   .setPermanentAddress("Another address 1")
                   .clickSubmitButton();

        textBoxPage.verifyResult("Frol Kalistratov", "Kalistratov@frol.com",
                "Some address 1", "Another address 1");
    }
}
