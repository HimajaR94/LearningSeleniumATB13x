package com.thetestingacademy.ex_05_SeleniumWaits;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class TestSelenium26_Waits {

    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();


        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.id("login-username"));
        username.sendKeys("admin@admin.com");

        WebElement password=driver.findElement(By.id("login-password"));
        password.sendKeys("1234");

        WebElement sign_in= driver.findElement(By.id("js-login-btn"));
        sign_in.click();

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
        //Max time - 3 sec
        //Condition ?

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        WebElement error_message=driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();


    }
}
