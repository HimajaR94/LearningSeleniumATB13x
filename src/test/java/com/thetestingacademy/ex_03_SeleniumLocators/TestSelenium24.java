package com.thetestingacademy.ex_03_SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium24 {

    @Test
    public void test_map(){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();

        //xpath --> //*[local-name()="svg"]/*[name()="g"][7]/*[name()="g"]/*[name()="g"]/*[name()="path"]


        List<WebElement> States= driver.findElements(By.xpath("//*[local-name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]"));

        for (WebElement state:States){
            System.out.println(state.getAttribute("aria-label"));

            if(state.getAttribute("aria-label").contains("Arunachal"))
            {
                state.click();
            }
        }


        driver.quit();


    }
}
