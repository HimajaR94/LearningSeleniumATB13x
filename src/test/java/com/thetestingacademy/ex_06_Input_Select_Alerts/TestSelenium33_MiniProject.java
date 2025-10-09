package com.thetestingacademy.ex_06_Input_Select_Alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium33_MiniProject {

    WebDriver driver= new FirefoxDriver();

    @Test
    public void test_iffy(){

        driver.navigate().to("https://iffy.com/sign-up");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));

        WebElement firstname= driver.findElement(By.name("firstName"));
        firstname.sendKeys("ted");

        WebElement lastname= driver.findElement(By.name("lastName"));
        lastname.sendKeys("Brown");

        get_temp_mail();

        driver.switchTo().window(parentWindow);

        WebElement email=driver.findElement(By.name("emailAddress"));
        email.click();
        email.sendKeys(Keys.CONTROL, "v");

        WebElement continue_button= driver.findElement(By.xpath("//button[@data-variant=\"solid\"]"));
        continue_button.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label=\"Enter verification code\"]")));



        driver.quit();

    }

    @Test
    public void get_temp_mail()  {
        WebDriver newTab= driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://temp-mail.org/en/");


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mail")));

       WebElement email= driver.findElement(By.id("mail"));



        //xpath --> (//button[@data-clipboard-action="copy"])[2]//*[local-name()="svg"]


        WebElement copy = driver.findElement(By.cssSelector("button#click-to-copy"));
        copy.click();





    }

}
