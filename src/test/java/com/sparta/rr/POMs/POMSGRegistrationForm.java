package com.sparta.rr.POMs;

import com.sparta.rr.Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.awt.*;
import java.util.List;

public class POMSGRegistrationForm extends PageBase {


    public POMSGRegistrationForm(WebDriver driver) {
        super(driver);
    }
    By firstName = By.id("firstName");
    By noFirsNameText = By.xpath("/html/body/div/form/div[1]/div/div");
    By submit = By.xpath("/html/body/div/form/button");
    String url = "http://localhost:9292/";
    By date = By.xpath("/html/body/div/form/div[4]/div/input");
    String color = webDriver.findElement(By.className("navbar-dark purple-background")).getCssValue("color");
    String hexColor = Color.fromString(color).asHex();
    List<WebElement> dates = webDriver.findElements(By.xpath("/html/body/div/form/div[4]/div/input"));


    public void isEmptyElement(){
        isEmpty("firstName");
        click(submit);
        isThisDisplaying(noFirsNameText);
    }

    public void selectDates(){
        for (WebElement date: dates) {
            String theDate = date.getText();
            if(theDate.equalsIgnoreCase("34"));
                date.click();
        }
        }

        public String returnColor(){
        return hexColor;
        }
}
