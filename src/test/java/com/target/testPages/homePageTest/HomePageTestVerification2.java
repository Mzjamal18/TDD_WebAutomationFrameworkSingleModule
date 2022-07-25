package com.target.testPages.homePageTest;

import com.target.pages.HomePageAction1;
import com.target.pages.HomePageAction2;
import configuration.common.WebTestBaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElementsLocator.verifySearchedProductWebElement;

public class HomePageTestVerification2 extends WebTestBaseSetup {
    HomePageAction2 homePageAction2;

    @BeforeMethod
    public void getInit(){
        homePageAction2= PageFactory.initElements(driver,HomePageAction2.class);
    }
    @Test
    public void verifySearchProductUsingValidProductName() throws InterruptedException {
//        homePageAction2= new HomePageAction2(driver);
        // Action method
        homePageAction2.searchProductUsingValidProductName();

        getInit();
        // Verification method
        String expectedProductName = "Popular Filters";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Thread.sleep(1000);
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }
}
