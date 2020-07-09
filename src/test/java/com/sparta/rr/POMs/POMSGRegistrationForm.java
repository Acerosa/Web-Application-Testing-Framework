package com.sparta.rr.POMs;

import com.sparta.rr.Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMSGRegistrationForm extends PageBase {


    public POMSGRegistrationForm(WebDriver driver) {
        super(driver);
    }
    By firstName = By.id("firstName");
    By noFirsNameText = By.xpath("/html/body/div/form/div[1]/div/div");
    By submit = By.xpath("/html/body/div/form/button");
    String url = "http://localhost:9292/";



    public void isEmptyElement(){
        isEmpty("firstName");
        click(submit);
        isThisDisplaying(noFirsNameText);
    }

}
