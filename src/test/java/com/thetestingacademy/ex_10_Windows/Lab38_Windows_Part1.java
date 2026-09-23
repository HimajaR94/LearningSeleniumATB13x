package com.thetestingacademy.ex_10_Windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import java.util.Set;

public class Lab38_Windows_Part1 {

    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent_id=driver.getWindowHandle();
        System.out.println(parent_id);

        WebElement click_here_link=driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));

        click_here_link.click();

        Set<String> window_handles= driver.getWindowHandles();
        System.out.println(window_handles);

        for (String window: window_handles){

            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }

        }

        driver.switchTo().window(parent_id);

        driver.quit();


    }
}
