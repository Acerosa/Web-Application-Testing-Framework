package com.sparta.rr.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageBase {



 public WebDriver webDriver;
  WebElement webElement;

//    public By firstName = By.id("firstName");
//    public By lastName = By.id("lastName");
//    public By age= By.xpath ("/html/body/div/form/div[3]/div/input");
//    public By dob = By.name ("dob");
//    public By male = By.xpath ("/html/body/div/form/div[5]/label");
//    public By female = By.xpath("/html/body/div/form/div[6]/label");
//    public By degree = By.xpath("/html/body/div/form/div[7]/div/input");
//    public WebElement uni = webDriver.findElement(By.id("inputUni"));
//    public Select uniSelection = new Select(uni);
//    public By address = By.id("inputAddress");
//    public By address2 = By.id("inputAddress2");
//    public By city = By.id("inputCity");
//    public WebElement county = webDriver.findElement(By.id("inputCounty"));
//    public Select countySelect = new Select(county);
//    public By postcode = By.id("inputPostcode");
//    public By email = By.id("inputemailaddress");
//    public By skills = By.id("exampleFormControlTextarea1");
//    public By phone = By.id("exampleFormControlInput1");
//    public By linkedin = By.xpath("/html/body/div/form/div[17]/div/input");
//    public By streamSDET = By.xpath("/html/body/div/form/div[20]/div[1]/label");
//    public By DevOps = By.xpath("/html/body/div/form/div[20]/div[2]/label");
//    public By terms = By.id("terms");
//    public WebElement slider = webDriver.findElement(By.id("experienceSlider"));
//    public Actions slideAction = new Actions(webDriver);
//    public By submit = By.xpath("/html/body/div/form/button");
//    public By noFirsNameText = By.xpath("/html/body/div/form/div[1]/div/div");
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

    public boolean isEmpty(String id){
        webElement = webDriver.findElement(By.id(id));
       return webElement.getAttribute("value").isEmpty();
    }
}
