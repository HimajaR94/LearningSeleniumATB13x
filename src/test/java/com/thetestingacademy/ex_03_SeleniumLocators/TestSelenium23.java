package com.thetestingacademy.ex_03_SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium23 {
    @Test
    public void test_svg(){

        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.name("q")).sendKeys("macmini");
        driver.findElement(By.xpath("//*[local-name()=\"svg\"]")).click();



         driver.quit();


    }
}
