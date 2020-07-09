package com.sparta.rr;

import static org.junit.Assert.assertTrue;

import com.sparta.rr.Base.BaseTest;
import com.sparta.rr.POMs.POMFillForm;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {
    /**
     * Rigorous Test :-)
     */

    POMFillForm pomFillForm = new POMFillForm(twebdriver);
    @Test
    public void shouldAnswerWithTrue()
    {
        pomFillForm.fillForm();

        Assertions.assertEquals("http://localhost:9292/registration_complete?dob=1986-01-25&customRadioInline1=on&cv=&streamRadioInline1=on",
                pomFillForm.webDriver.getCurrentUrl());

    }


}
