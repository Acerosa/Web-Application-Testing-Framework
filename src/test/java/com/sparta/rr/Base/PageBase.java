package com.sparta.rr.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

 public WebDriver webDriver;
  WebElement webElement;

    public PageBase(WebDriver driver){
        this.webDriver = driver;
    }

    public void click(By element) {
        webDriver.findElement(element).click();
    }

    public void writeThis(By element, String text){
        webDriver.findElement(element).sendKeys(text);
    }

    public void writeThisElement(By element, String text){
        webDriver.findElement(element).sendKeys(text);
    }
    public String readThis(By element){
       return webDriver.findElement(element).getText();

    }

    public boolean isThisDisplaying(By element){
        return webDriver.findElement(element).isDisplayed();
    }

    public boolean isEmptyById(String id){
        webElement = webDriver.findElement(By.id(id));
       return webElement.getAttribute("value").isEmpty();
    }

    public boolean isEmptyByXpath(String xpath){
        webElement = webDriver.findElement(By.xpath(xpath));
        return webElement.getAttribute("value").isEmpty();
    }

}
