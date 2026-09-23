package com.thetestingacademy.ex_10_Windows;

import com.thetestingacademy.ex_07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab41_iframe_SingleFrame {

    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        new WaitHelpers().waitJVM(5000);

        /*WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id=\"singleframe\"]")));*/

        WebElement frame= driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));

        driver.switchTo().frame(frame);

        WebElement input_box=driver.findElement(By.xpath("//div[@class=\"col-xs-6 col-xs-offset-5\"]/input"));

        input_box.clear();
        input_box.sendKeys("This is a test");

        driver.switchTo().defaultContent();

        driver.quit();

    }

}
