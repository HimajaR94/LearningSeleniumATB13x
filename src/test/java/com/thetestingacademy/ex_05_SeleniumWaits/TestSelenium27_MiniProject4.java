package com.thetestingacademy.ex_05_SeleniumWaits;

import com.thetestingacademy.Utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import static com.thetestingacademy.ex_07_WaitHelper.WaitHelpers.waitForVisibility;

public class TestSelenium27_MiniProject4 extends CommonToAll {

    @Description("Verify Make my trip opens with Modal")
    @Test
    public void test_CloseModal(){
        WebDriver driver = new FirefoxDriver();


        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        waitForVisibility(driver,5, "//span[@data-cy=\"closeModal\"]");

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModal.click();

        closeBrowser(driver);


    }
}
