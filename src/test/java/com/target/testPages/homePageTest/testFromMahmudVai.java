package com.target.testPages.homePageTest;

import com.target.pages.HomePageAction;
import com.target.pages.HomePagefromMahmudVai;
import configuration.common.WebTestBaseSetupFromMahmudVai;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElementsLocator.verifySearchedProductWebElement;

public class testFromMahmudVai extends WebTestBaseSetupFromMahmudVai {
    HomePagefromMahmudVai homePage2;

    @BeforeMethod
    public void getInit(){
        homePage2= PageFactory.initElements(driver, HomePagefromMahmudVai.class);
    }



    @Test(enabled = false)
    @Ignore
    public void verifySearchProductUsingValidProductName() throws InterruptedException {
        // Action method
        HomePageAction homePage = new HomePageAction(driver);
        homePage.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }


    @Test(enabled = false)
    @Ignore
    public void verifySearchProductUsingValidProductName3() throws InterruptedException {
        // Action method
        HomePageAction homePage = new HomePageAction(driver);
        homePage.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

//    @Test
//    public void verifySearchProductUsingValidProductName1() {
////        HomePage homePage = new HomePage(driver);
//        HomePage2 homePage2= PageFactory.initElements(driver,HomePage2.class);
//        // Action method
//        homePage2.searchProductUsingValidProductName();
//
//        // Verification method
//        String expectedProductName = "\"Hand Sanitizer\"";
//        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//
//    }



//    @Test
//    public void verifySearchProductUsingValidProductName1() {
////        HomePage homePage = new HomePage(driver);
//        getInit();
//        // Action method
//        homePage2.searchProductUsingValidProductName();
//
//        // Verification method
//        String expectedProductName = "\"Hand Sanitizer\"";
//        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//
//    }

    @Test @Ignore
    public void verifySearchProductUsingValidProductName1() {
        // Action method
        homePage2.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

    @Test @Ignore
    public void verifySearchProductUsingValidProductName7() {
        // Action method
        homePage2.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer1\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }
    @Test @Ignore
    public void verifySearchProductUsingValidProductNameFromDirectArray() throws InterruptedException {
        // Action method
        homePage2.searchProductUsingValidProductName1();
    }
    @Test @Ignore
    public void verifySearchProductUsingValidProductNameFromExcel() throws Exception {
        // Action method
        homePage2.searchProductUsingValidProductName2();
    }
    @Test
    public void verifySearchProductUsingValidProductNameFromDataProvider() throws Exception {
        // Action method
        homePage2.searchProductUsingValidProductName4();
    }
}
