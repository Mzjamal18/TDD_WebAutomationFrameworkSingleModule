package com.target.pages;

import configuration.common.WebTestBaseSetupFromMahmudVai;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.target.pageElement.HomePageElementsLocator.searchBoxWebElement;
import static com.target.pageElement.HomePageElementsLocator.searchButtonWebElement;
import static configuration.common.GlobalReUsableMethods.clickOnElement;
import static configuration.common.GlobalReUsableMethods.enterValueOnElement;

public class HomePageNewAction extends WebTestBaseSetupFromMahmudVai {

    public HomePageNewAction() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath = searchButtonWebElement)
    public WebElement searchButton;

//    @FindBy(xpath = verifySearchedProductWebElement)
    public WebElement verifySearchedProduct;

    public void searchProductUsingValidProductName(String productName) throws InterruptedException {
        Thread.sleep(4000);
        enterValueOnElement(searchBox, productName);
        Thread.sleep(4000);
        clickOnElement(searchButton);
        Thread.sleep(4000);

    }
}
