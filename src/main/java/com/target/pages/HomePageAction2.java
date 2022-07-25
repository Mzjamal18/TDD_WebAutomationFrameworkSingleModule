package com.target.pages;

import configuration.common.WebTestBaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.target.pageElement.HomePageElementsLocator.*;
import static configuration.utilities.DataDriven.getItemsListFromDB;
import static configuration.utilities.DataDriven.getItemsListFromExcel;

public class HomePageAction2 extends WebTestBaseSetup {


    public HomePageAction2(WebDriver driver) {
        // WebTestBase.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath=searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath=searchButtonWebElement)
    public WebElement searchButton;
    public void searchProductUsingValidProductName() throws InterruptedException {
//        Thread.sleep(000);
        searchBox.sendKeys("Mask");
        waitFor(1000);
        searchButton.click();
        waitFor(1000);

    }

    public static List<String> getExpectedProducts() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Hand sanitizer");
        itemsList.add("iphone 11 pro max");
        itemsList.add("T-shirt");
        itemsList.add("Mens shirt");
        itemsList.add("Shoes");
        itemsList.add("Camera");
        itemsList.add("Bike");
        itemsList.add("Tv");
        return itemsList;
    }

    // Data Driven Approach : Direct data
    public void searchProductUsingValidProductName1() throws InterruptedException {
        for (String st : getExpectedProducts()) {
            searchBox.clear();
            searchBox.sendKeys(st);
            searchButton.click();
            // Verification method
            String expectedProductName = "Popular Filters";
            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
            waitFor(1000);
            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

        }
    }

    // Data driven approach from Excel
    public void searchProductUsingValidProductName2() throws Exception {
        for (int i = 0; i < getItemsListFromExcel().size(); i++) {
            searchBox.clear();
            searchBox.sendKeys(getItemsListFromExcel().get(i+1));
            searchButton.click();
            // Verification method
            String expectedProductName = "Popular Filters";
            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
            waitFor(1000);
            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

        }
    }

    // Data driven approach from Database
    public void searchProductUsingValidProductName3() throws Exception {
        for (String st : getItemsListFromDB()) {
            searchBox.clear();
            searchBox.sendKeys(st);
            searchButton.click();
            // Verification method
            String expectedProductName = "Popular Filters";
            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
            Thread.sleep(3000);
            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

        }
    }
}
