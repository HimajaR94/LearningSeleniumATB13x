package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 {
    @Description("TC#1 - Verify that a particular text exists on the Katalon website ")
    @Link("https://katalon-demo-cura.herokuapp.com/")
    @Test
    public void test_verify_text_katalon(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test case passed");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("Test case Failed");
            Assert.fail();
        }
        driver.quit();

    }

}
