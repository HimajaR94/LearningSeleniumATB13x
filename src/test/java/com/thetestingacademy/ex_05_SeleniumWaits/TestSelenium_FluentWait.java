package com.thetestingacademy.ex_05_SeleniumWaits;

import com.thetestingacademy.ex_07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.function.Function;

import static com.thetestingacademy.ex_07_WaitHelper.WaitHelpers.waitFluentVisibility;

public class TestSelenium_FluentWait {

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


        //xpath --> //div[@class="notification-box-description"]

       waitFluentVisibility(driver,20,2,"//div[@class=\"notification-box-description\"]");

        WebElement error_message=driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();




    }
}
