package com.thetestingacademy.ex_03_SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium22 {
    @Test
    public void test_orange_hcm(){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("Hacker@4321");

        //xpath - //button[@class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"]
        //xpath - //button[normalize-space()="Login"]
        driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();

        //div[@class="oxd-table orangehrm-employee-list"]

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement table=driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]"));
        List<WebElement> row=table.findElements(By.className("oxd-table-card"));

        for (int i=0;i< row.size();i++){
            List<WebElement> col=row.get(i).findElements(By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"]"));
            for(WebElement c:col){
                System.out.println(c.getText());
            }
        }
        driver.quit();
    }
}
