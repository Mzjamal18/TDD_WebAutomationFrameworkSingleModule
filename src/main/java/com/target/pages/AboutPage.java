package com.target.pages;

import configuration.common.WebTestBaseSetupFromMahmudVai;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static configuration.common.GlobalReUsableMethods.*;

public class AboutPage extends WebTestBaseSetupFromMahmudVai {


    public void verifyAboutUs() {
        driver.findElement(By.xpath("jkljljol")).click();
        driver.findElement(By.xpath("jkljljol")).sendKeys("dsfsdfsd");
        driver.findElement(By.xpath("jkljljol")).click();
        driver.findElement(By.xpath("jkljljol")).click();


        // ReUsable Method is calling
        clickOnElementByXpath("jkljljol");
        enterValueOnElement("eeedddd", "Hand sanitizer");
        clickOnElementByXpath("eeee");
        clickOnElementByXpath("jkljddddljol");

    }

    @FindBy(xpath = "kjldfjlsd")
    public static WebElement about;

    @FindBy(xpath = "kjldfjlsd")
    public List<WebElement> aboutList;

    public void search() {
        clickOnElement(about);
        clickOnElement(about);
        clickOnElement(about);
        clickOnElement(about);
        waitUntilClickable(about);
        explicitWaitForElementUsingVisibilityOf(about).click();
        explicitWaitForElementUsingVisibilityOf(about).sendKeys("hand sanitizer");
        fluentWaitUntilConditionMeet(about).click();
        selectByVisibleTextFromSelect(about,"Newest");
        selectByIndexFromSelect(about,4);
        getListOfString(aboutList);


    }


}
