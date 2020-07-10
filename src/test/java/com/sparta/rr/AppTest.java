package com.sparta.rr;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sparta.rr.Base.BaseTest;
import com.sparta.rr.POMs.POMFillForm;
import com.sparta.rr.POMs.POMSGRegistrationForm;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {
    /**
     * Rigorous Test :-)
     */

    POMFillForm pomFillForm = new POMFillForm(twebdriver);
    POMSGRegistrationForm registrationForm = new POMSGRegistrationForm(twebdriver);
    String color = "#3D0B37";
    String firstNameColor = twebdriver.findElement(By.id("firstName")).getCssValue("color");
    String hexFirstColor = Color.fromString(firstNameColor).asHex();

    public void threadThis(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPomFillForm()
    {
        pomFillForm.fillForm();
       assertEquals("http://localhost:9292/registration_complete?dob=1986-01-25&customRadioInline1=on&cv=&streamRadioInline1=on",
                pomFillForm.webDriver.getCurrentUrl());
        threadThis();
    }

    @Test
    public void testIfErrorTextDisplays(){
        registrationForm.isEmptyElement();
        threadThis();
    }

    @Test
    public void testSelectDate(){
        registrationForm.selectDates();
        threadThis();
    }

    @Test
    public void testColor(){
        assertEquals("#495057", registrationForm.returnColor(hexFirstColor));
        threadThis();
    }

    @Test
    public void testForUrlValidation(){
        registrationForm.writeWrongToElement();
        threadThis();
    }
}
