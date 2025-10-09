package com.thetestingacademy.ex_06_Input_Select_Alerts;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestSelenium30_Alerts extends CommonToAll {

    @Test
    public void test_alerts(){

        WebDriver driver= new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onClick=\"jsAlert()\"]")));

        //xpath --> //button[normalize-space()="Click for JS Alert"]
        //xpath for JS Confirm --> //button[normalize-space()="Click for JS Confirm"]
        //xpath for JS Prompt --> //button[normalize-space()="Click for JS Prompt"]

        //xpath for result --> //p[@id="result"]


        //CSS Selector
        //button[onClick="jsAlert()"]
        //button[onClick="jsConfirm()"]
        //button[onClick="jsPrompt()"]


        WebElement element= driver.findElement(By.cssSelector("button[onClick=\"jsAlert()\"]"));

        element.click();


        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();



        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");

        driver.quit();


        }






    }




