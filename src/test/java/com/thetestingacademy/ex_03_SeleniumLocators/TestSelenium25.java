package com.thetestingacademy.ex_03_SeleniumLocators;

import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium25 {

    @Test

    public void sauceDemo() throws InterruptedException {

        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));



        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

        WebElement login=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));

        login.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')]")));

        List<WebElement>  inventory_List= driver.findElements(By.xpath("//div[contains(@class,'inventory_item_name')]"));

        for (WebElement list:inventory_List){
            System.out.println(list.getText());
        }

        WebElement price = driver.findElement(By.xpath("(//div[@class=\"inventory_item\"])[2]//div[@class=\"inventory_item_price\"]"));

        System.out.println(price.getText());

        driver.quit();

    }
}
