package com.thetestingacademy.ex_03_SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21 {

    @Test
    public  void test_web_table1(){

        WebDriver driver= new FirefoxDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        //xpath --> //table[@summary="Sample Table"]

        WebElement table=driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        //rows and columns
        List<WebElement> row_tables=table.findElements(By.tagName("tr"));

        for (int i=0; i<row_tables.size(); i++){

            List<WebElement> col=row_tables.get(i).findElements(By.xpath("td"));
            for(WebElement c:col){
                System.out.println(c.getText());
            }

        }
        driver.quit();
    }

}
