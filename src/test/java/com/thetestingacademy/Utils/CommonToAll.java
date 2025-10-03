package com.thetestingacademy.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonToAll {
    public void openBrowser(WebDriver driver, String url){

        driver.manage().window().maximize();
        driver.get(url);
    }

    public void closeBrowser(WebDriver driver){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public WebElement findElementByPartialText(WebDriver driver, String text){
        return driver.findElement(By.partialLinkText(text));
    }
    

}
