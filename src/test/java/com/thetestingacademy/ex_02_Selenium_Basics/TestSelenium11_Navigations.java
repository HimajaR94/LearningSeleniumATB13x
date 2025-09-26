package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11_Navigations {
    @Description("Open the URL")
    @Test
    public void test_Navigation(){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");
        driver.navigate().to("https:///www.bing.com");

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();


    }
}
