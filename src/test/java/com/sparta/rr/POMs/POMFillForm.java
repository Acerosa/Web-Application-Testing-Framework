package com.sparta.rr.POMs;

import com.sparta.rr.Base.PageBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class POMFillForm extends PageBase {


    public POMFillForm(WebDriver driver) {
        super(driver);
    }

   public By firstName = By.id("firstName");
   public By lastName = By.id("lastName");
   public By age= By.xpath ("/html/body/div/form/div[3]/div/input");
   public By dob = By.name ("dob");
   public By male = By.xpath ("/html/body/div/form/div[5]/label");
   public By female = By.xpath("/html/body/div/form/div[6]/label");
   public By degree = By.xpath("/html/body/div/form/div[7]/div/input");
   public WebElement uni = webDriver.findElement(By.id("inputUni"));
   public Select uniSelection = new Select(uni);
   public By address = By.id("inputAddress");
   public By address2 = By.id("inputAddress2");
   public By city = By.id("inputCity");
   public WebElement county = webDriver.findElement(By.id("inputCounty"));
   public Select countySelect = new Select(county);
   public By postcode = By.id("inputPostcode");
   public By email = By.id("inputemailaddress");
   public By skills = By.id("exampleFormControlTextarea1");
   public By phone = By.id("exampleFormControlInput1");
   public By linkedin = By.xpath("/html/body/div/form/div[17]/div/input");
   public By streamSDET = By.xpath("/html/body/div/form/div[20]/div[1]/label");
   public By DevOps = By.xpath("/html/body/div/form/div[20]/div[2]/label");
   public By terms = By.id("terms");
   public WebElement slider = webDriver.findElement(By.id("experienceSlider"));
   public Actions slideAction = new Actions(webDriver);
   public By submit = By.xpath("/html/body/div/form/button");
   public By noFirsNameText = By.xpath("/html/body/div/form/div[1]/div/div");

    public void treadThis() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void fillForm(){
        writeThis(firstName, "Ricardo");
        writeThis(lastName, "Rosa");
        writeThis(age, "34");
        writeThis(dob, "25011986");
        click(male);
        writeThis(degree, "Software engineering ");
        uniSelection.selectByIndex(1);
        writeThis(address, "123 Court Road");
        writeThis(address2, "High road");
        writeThis(city, ":London");
        countySelect.selectByIndex(2);
        writeThis(postcode, "HG4 FN5");
        writeThis(email, "name@example.com");
        writeThis(skills, "Good coder");
        writeThis(phone, "1234567");
        writeThis(linkedin, "https://www.linkedin.com/in/ricardo-rosa-7a66a2184/");
        click(streamSDET);
        click(terms);
        slideAction.moveByOffset(200,0);
        slideAction.release().build();
            treadThis();
        click(submit);
    }
}
