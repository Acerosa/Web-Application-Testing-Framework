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


    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By age= By.xpath ("/html/body/div/form/div[3]/div/input");
    By dob = By.name ("dob");
    By male = By.xpath ("/html/body/div/form/div[5]/label");
    By female = By.xpath("/html/body/div/form/div[6]/label");
    By degree = By.xpath("/html/body/div/form/div[7]/div/input");
    WebElement uni = webDriver.findElement(By.id("inputUni"));
    Select uniSelection = new Select(uni);
    By address = By.id("inputAddress");
    By address2 = By.id("inputAddress2");
    By city = By.id("inputCity");
    WebElement county = webDriver.findElement(By.id("inputCounty"));
    Select countySelect = new Select(county);
    By postcode = By.id("inputPostcode");
    By email = By.id("inputemailaddress");
    By skills = By.id("exampleFormControlTextarea1");
    By phone = By.id("exampleFormControlInput1");
    By linkedin = By.xpath("/html/body/div/form/div[17]/div/input");
    By streamSDET = By.xpath("/html/body/div/form/div[20]/div[1]/label");
    By DevOps = By.xpath("/html/body/div/form/div[20]/div[2]/label");
    By terms = By.id("terms");
    WebElement slider = webDriver.findElement(By.id("experienceSlider"));
    Actions slideAction = new Actions(webDriver);
    By submit = By.xpath("/html/body/div/form/button");

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
        click(submit);
    }
}
