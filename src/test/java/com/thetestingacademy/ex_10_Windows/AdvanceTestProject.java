package com.thetestingacademy.ex_10_Windows;
import com.thetestingacademy.ex_07_WaitHelper.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import org.testng.annotations.Test;

public class AdvanceTestProject {

    @Test
    public void test_interview_vwo_project() {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");

        new WaitHelpers().waitJVM(5000);

        String parent_Window= driver.getWindowHandle();

        WebElement url_input= driver.findElement(By.name("primaryUrl"));

        url_input.clear();

        url_input.sendKeys("https://thetestingacademy.com");

        WebElement view_heatmap_button = driver.findElement(By.xpath("//button[normalize-space()='View Heatmap']"));

        view_heatmap_button.click();

        new WaitHelpers().waitJVM(10000);


        

    }

}