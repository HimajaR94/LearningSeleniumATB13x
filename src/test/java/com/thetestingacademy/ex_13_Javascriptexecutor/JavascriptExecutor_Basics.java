package com.thetestingacademy.ex_13_Javascriptexecutor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.thetestingacademy.ex_07_WaitHelper.WaitHelpers.waitJVM;

public class JavascriptExecutor_Basics {

    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.location='https://google.com'");

        waitJVM(5000);

        driver.quit();

    }
}
