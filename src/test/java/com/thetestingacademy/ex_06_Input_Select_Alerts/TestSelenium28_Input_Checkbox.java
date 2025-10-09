package com.thetestingacademy.ex_06_Input_Select_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium28_Input_Checkbox {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Himaja");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("R");

        //radio buttons
        WebElement female = driver.findElement(By.id("sex-1"));
        female.click();

        WebElement exp = driver.findElement(By.id("exp-4"));
        exp.click();

        WebElement prof_checkbox=driver.findElement(By.id("profession-1"));
        prof_checkbox.click();

        WebElement continents_dropdown = driver.findElement(By.id("continents"));
        Select select = new Select(continents_dropdown);

        select.selectByVisibleText("Australia");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();



    }
}
