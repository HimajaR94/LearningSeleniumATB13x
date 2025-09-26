package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class TestSelenium09_TestNG_Assertions {
    @Test
    public void test_selenium_assertions(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        assertThat(driver.getCurrentUrl()).isNotNull().isNotBlank().isEqualTo("https://www.google.com/");
        driver.quit();

    }



}
