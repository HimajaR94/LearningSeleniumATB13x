package com.thetestingacademy.ex_03_SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium21 {

    @Test
    public  void test_web_table1(){

        WebDriver driver= new FirefoxDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        //xpath --> //table[@summary="Sample Table"]




    }

}
