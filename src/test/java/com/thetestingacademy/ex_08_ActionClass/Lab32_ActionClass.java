package com.thetestingacademy.ex_08_ActionClass;

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab32_ActionClass {

    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://awesomeqa.com/practice.html");

        Actions actions = new Actions(driver);

        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("the");

        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"The Testing Academy").keyUp(Keys.SHIFT).build().perform();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();





    }
}
