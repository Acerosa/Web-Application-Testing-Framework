package com.sparta.rr.Base;

import com.sparta.rr.FactoryBrowser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver twebdriver;
    public static  FactoryBrowser factoryBrowser;
    public static String browser;

    @BeforeClass
    public static void setUp(){
        twebdriver = factoryBrowser.launchingBrowser("chrome");
        twebdriver.get("http:localhost:9292/");
        twebdriver.manage().window().maximize();
    }


//    public void maxWindow(){
//        twebdriver.manage().window().maximize();
//    }


//    @AfterClass
//    public static void shootItDown() {
//        twebdriver.quit();
//    }
}
