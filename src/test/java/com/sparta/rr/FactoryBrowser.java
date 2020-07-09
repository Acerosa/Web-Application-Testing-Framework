package com.sparta.rr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.lang.ref.WeakReference;

public class FactoryBrowser {

    WebDriver webDriver;

    public WebDriver launchingBrowser(String browser) {

        switch (browser) {
            case "firefox":
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

