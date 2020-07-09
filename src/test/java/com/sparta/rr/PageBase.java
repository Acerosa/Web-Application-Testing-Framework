package com.sparta.rr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

    WebDriver webDriver;

    public PageBase  (WebDriver driver){
        this.webDriver = driver;
    }

    public void click(By element) {
        webDriver.findElement(element).click();
    }

    public void writeThis(By element, String text){
        webDriver.findElement(element).sendKeys(text);
    }

    public String readThis(By element){
       return webDriver.findElement(element).getText();

    }

    private boolean isThisDisplaying(By element){
        return webDriver.findElement(element).isDisplayed();
    }
}
