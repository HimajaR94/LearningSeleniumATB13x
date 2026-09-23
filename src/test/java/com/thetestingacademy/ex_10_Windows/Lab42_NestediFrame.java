package com.thetestingacademy.ex_10_Windows;

import com.thetestingacademy.ex_07_WaitHelper.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab42_NestediFrame {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement iframe_tab= driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));

        iframe_tab.click();

        /*WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@id=\"Multiple\"]/iframe")));*/

        new WaitHelpers().waitJVM(5000);

        WebElement frame= driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));

        driver.switchTo().frame(frame);

        WebElement frame1=driver.findElement(By.xpath("//div[@class=\"iframe-container\"]/iframe"));

        driver.switchTo().frame(frame1);

        WebElement input_box=driver.findElement(By.xpath("//div[@class=\"col-xs-6 col-xs-offset-5\"]/input"));

        input_box.clear();
        input_box.sendKeys("This is a test");

        driver.switchTo().defaultContent();

        driver.quit();



    }

}
