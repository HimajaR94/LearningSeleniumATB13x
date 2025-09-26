package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestSelenium12_Options {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        //options.addArguments("--incognito");

        WebDriver driver= new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        driver.quit();


    }
}
