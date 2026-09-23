package com.thetestingacademy.ex_10_Windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab40_iframe_demoQA {

    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/frames");

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));

        WebElement frame1 = driver.findElement(By.id("frame1"));

        driver.switchTo().frame(frame1);

        WebElement content_frame1= driver.findElement(By.id("sampleHeading"));

        System.out.println("Frame1 Content:"+content_frame1.getText());

        driver.switchTo().defaultContent();

        WebElement frame2= driver.findElement(By.id("frame2"));

        driver.switchTo().frame(frame2);

        WebElement content_frame2= driver.findElement(By.id("sampleHeading"));

        System.out.println("Frame2 Content:"+content_frame2.getText());

        driver.switchTo().defaultContent();


        driver.quit();


    }
}
