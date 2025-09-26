package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Code(){
        Assert.assertEquals("Himaja","Himaja");
    }
    @Test
    public void test_OpenTheTestingAcademy(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://thetestingacademy.com");

        WebDriver driver1=new ChromeDriver();

        //Search Context - Interface - findElement and findElements
        //WebDriver implements Search Context - Interface - (10 incomplete functions)
        //RemoteWebDriver implements WebDriver - Class  -(15 functions)
        //ChromiumDriver extends RemoteWebDriver - Class - 25 functions
        //EdgeDriver and ChromeDriver extends ChromiumDriver - Class -45 functions
        //FirefoxDriver, InternetExplorerDriver, SafariDriver extends RemoteWebDriver

        ChromiumDriver driver4=new ChromeDriver();


        // Scenarios

        // 1. Do want to run on  Chrome or Edge? (1-2%)
        ChromeDriver driver3 = new ChromeDriver();


        // 2  Do you want to run on Chrome then change to Edge ? (96%)
        WebDriver driver2 = new ChromeDriver();
//        driver1 = new EdgeDriver();


        // 3. Do you want to run on multiple browsers, aws machine? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)



    }
}
