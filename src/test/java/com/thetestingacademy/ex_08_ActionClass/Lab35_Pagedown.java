package com.thetestingacademy.ex_08_ActionClass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.*;

public class Lab35_Pagedown {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://thetestingacademy.com/");

        driver.manage().window().maximize();

        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        driver.quit();



    }
}
