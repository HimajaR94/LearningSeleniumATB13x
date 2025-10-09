package com.thetestingacademy.ex_06_Input_Select_Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium29_SelectStatic {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.id("dropdown"));

        Select select = new Select(dropdown);

        select.selectByIndex(1);

        driver.quit();


    }

}
