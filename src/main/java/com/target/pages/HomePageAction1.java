package com.target.pages;

import configuration.common.WebTestBaseSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.target.pageElement.HomePageElementsLocator.searchBoxWebElement;
import static com.target.pageElement.HomePageElementsLocator.searchButtonWebElement;

public class HomePageAction1 extends WebTestBaseSetup {

    public HomePageAction1(WebDriver driver) {
        // WebTestBase.driver=driver;
        PageFactory.initElements(driver, this);
    }
//     Action class for business flow
//
//     search box functionality should work with valid product name
//
//     Action method for search box functionality with valid product name purpose
//    public static void searchProductUsingValidProductName1() throws InterruptedException {
//        driver.findElement(By.xpath(searchBoxWebElement)).sendKeys("Mask");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath( searchButtonWebElement)).click();
//        Thread.sleep(3000);
//    }

    @FindBy(xpath=searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath=searchButtonWebElement)
    public WebElement searchButton;
    public void searchProductUsingValidProductName() throws InterruptedException {
        Thread.sleep(4000);
        searchBox.sendKeys("Mask");
        Thread.sleep(4000);
        searchButton.click();
        Thread.sleep(4000);

    }
}
