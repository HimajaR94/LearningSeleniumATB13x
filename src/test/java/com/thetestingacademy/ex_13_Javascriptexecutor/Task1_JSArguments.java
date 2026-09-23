package com.thetestingacademy.ex_13_Javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.thetestingacademy.ex_07_WaitHelper.WaitHelpers.waitJVM;

public class Task1_JSArguments {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.location='https://demoqa.com/text-box'");

        waitJVM(10000);

        WebElement fullName=driver.findElement(By.id("userName"));

        js.executeScript("arguments[0].style.border='3px solid red'",fullName);

        waitJVM(2000);

        js.executeScript("arguments[0].value='Himaja Rayapudi';",fullName);


        WebElement email= driver.findElement(By.id("userEmail"));

        //js.executeScript("arguments[0].setAttribute('value',arguments[1]);",email, "himajarayapudi@example.com");

        String emailId="himajarayapudi@example.com";

        js.executeScript("arguments[0].value=arguments[1];",email,emailId);

        waitJVM(5000);

        driver.quit();



    }

}
