package com.target.testPages.homePageTest;

import com.target.pages.HomePageAction;
import com.target.pages.HomePageAction1;
import configuration.common.WebTestBaseSetup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElementsLocator.verifySearchedProductWebElement;

public class HomePageTestVerification1 extends WebTestBaseSetup {

 HomePageAction1 homePageAction1;
    @Test
    public void verifySearchProductUsingValidProductName() throws InterruptedException {
        homePageAction1= new HomePageAction1(driver);
        // Action method
        homePageAction1.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "Popular Filters";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }
}
