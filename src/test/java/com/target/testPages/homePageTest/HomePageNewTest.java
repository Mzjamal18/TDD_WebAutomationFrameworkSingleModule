package com.target.testPages.homePageTest;

import com.target.pages.HomePageNewAction;
import configuration.common.WebTestBaseSetupFromMahmudVai;
import org.testng.annotations.Test;

import static configuration.common.GlobalReUsableMethods.verifyText;

public class HomePageNewTest extends WebTestBaseSetupFromMahmudVai {

    @Test
    public void verifySearchValidProduct() throws InterruptedException {
        HomePageNewAction homePageNew=new HomePageNewAction();
        homePageNew.searchProductUsingValidProductName("Hand Sanitizer");
        verifyText(homePageNew.verifySearchedProduct,"\"Hand Sanitizer\"","Product name does not match");
    }
}
