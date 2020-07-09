package com.sparta.rr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FactoryBrowser {

   public static WebDriver webDriver;
   public static String browser;

    public static WebDriver launchingBrowser(String lbrowser) {
        browser = lbrowser;
        switch (browser) {
            case  "firefox":
                webDriver = new FirefoxDriver();
                break;
            case "chrome":
                webDriver = new ChromeDriver();
                break;
            case "IE":
                webDriver = new InternetExplorerDriver();
                break;
        }
            return webDriver;
    }

}

