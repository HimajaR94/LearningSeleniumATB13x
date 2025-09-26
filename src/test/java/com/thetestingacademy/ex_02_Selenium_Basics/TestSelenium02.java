package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Test
    public void test_Selenium01(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://google.com");
    }

}
