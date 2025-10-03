package com.thetestingacademy.ex_03_SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium18_Selenium_Locators {
    @Description("TC#1 Verify that with invalid email address, error message is displayed")
    @Owner("Himaja")
    @Test
    public void test_invalidEmail(){
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vwo.com");

        WebElement a_Tag_free_trial_full_match=driver.findElement(By.partialLinkText("trial"));
        a_Tag_free_trial_full_match.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement businessEmail=driver.findElement(By.name("email"));
        businessEmail.sendKeys("abcd");
        WebElement consentCheckbox=driver.findElement(By.name("gdpr_consent_checkbox"));
        consentCheckbox.click();

        WebElement button=driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_message=driver.findElement(By.className("invalid-reason"));
        System.out.println(error_message.getText());
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");


        driver.quit();


    }
}
