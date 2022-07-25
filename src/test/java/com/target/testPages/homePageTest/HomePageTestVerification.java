package com.target.testPages.homePageTest;

import com.target.pages.HomePageAction;
import configuration.common.WebTestBaseSetup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElementsLocator.verifySearchedProductWebElement;

public class HomePageTestVerification extends WebTestBaseSetup {

//    Same work with three different way in three classes

    @Test
    public void verifySearchProductUsingValidProductName() throws InterruptedException {
        HomePageAction homePage = new HomePageAction(driver);
        // Action method
        homePage.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "Popular Filters";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

}
