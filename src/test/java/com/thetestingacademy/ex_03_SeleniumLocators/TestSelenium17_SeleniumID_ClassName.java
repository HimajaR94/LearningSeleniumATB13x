package com.thetestingacademy.ex_03_SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_SeleniumID_ClassName {

    @Description("TC#1 Verify that with invalid login, error message is displayed")
    @Owner("Himaja Rayapudi")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void test_vwo_login_invalid_login(){

        //using Firefox options class
//        FirefoxOptions options= new FirefoxOptions();
//        options.addArguments("--start-maximized");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");

        //Maximize the window
        driver.manage().window().maximize();

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0"
        // > close Tag

        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.



        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message=driver.findElement(By.className("notification-box-description"));



        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();



    }


}
