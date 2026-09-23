package com.thetestingacademy.ex_10_Windows;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
public class Lab39_iframe {

        public static void main(String[] args){

            WebDriver driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/iframe");

            WebElement frame= driver.findElement(By.id("mce_0_ifr"));

            driver.switchTo().frame(frame);

            WebElement editor= driver.findElement(By.id("tinymce"));

            editor.clear();

            editor.sendKeys("Hello from Himaja!");

            driver.switchTo().defaultContent();

            WebElement header = driver.findElement(By.tagName("h3"));
            System.out.println("Header:"+header.getText());


            driver.quit();


            


        }



}
