package com.thetestingacademy.ex_06_Input_Select_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium31_ConfirmAlert {

    @Test
    public void confirmAlert(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.getTitle();

        WebElement elementConfirm= driver.findElement(By.cssSelector("button[onClick=\"jsConfirm()\"]"));
        elementConfirm.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));

        WebElement result= driver.findElement(By.id("result"));

        System.out.println(result.getText());

        Assert.assertEquals(result.getText(),"You clicked: Cancel");

        driver.quit();


    }
}
