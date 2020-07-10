package com.sparta.rr;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sparta.rr.Base.BaseTest;
import com.sparta.rr.POMs.POMFillForm;
import com.sparta.rr.POMs.POMSGRegistrationForm;
import org.junit.Test;
import org.junit.jupiter.api.*;

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
    @Test
    public void shouldAnswerWithTrue()
    {
        pomFillForm.fillForm();

       assertEquals("http://localhost:9292/registration_complete?dob=1986-01-25&customRadioInline1=on&cv=&streamRadioInline1=on",
                pomFillForm.webDriver.getCurrentUrl());

    }

    @Test
    public void testIfErrorTextDisplays(){
        registrationForm.isEmptyElement();
    }

    @Test
    public void testSelectDate(){
        registrationForm.selectDates();
    }

    @Test
    public void testColor(){

        assertEquals("#3D0B37", registrationForm.returnColor());
    }


}
