package com.sparta.rr;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public WebDriver twebdriver;
    public FactoryBrowser factoryBrowser;

    @BeforeClass
    public void setUp(String browser){
        this.twebdriver = factoryBrowser.launchingBrowser(browser);

        twebdriver.manage().window().maximize();
    }

    @AfterClass
    public void shootItDown() {
        twebdriver.quit();
    }
}
