package com.thetestingacademy.ex_03_SeleniumLocators;

import com.thetestingacademy.ex_07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium23 {
    @Test
    public void test_svg() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        WaitHelpers.waitForVisibility(driver, 2000, "//input[@name=\"q\"]");

        driver.findElement(By.name("q")).sendKeys("mac mini");
        driver.findElement(By.xpath("//*[local-name()=\"svg\"]")).click();


//        List<WebElement> svgElements= driver.findElements(By.xpath("//*[local-name()=\"svg\"]"));
//        svgElements.get(0).click();


//        List<WebElement> items= driver.findElements(By.className("wjcEIp"));

        WebElement pageInfo = driver.findElement(By.xpath("//span[contains(text(),\"Page\")]"));

        String pageText = pageInfo.getText();

        System.out.println("Pagination text:" + pageText);

        int total_pages = Integer.parseInt(pageText.split("of")[1].trim());

        for (int current_page = 1; current_page <= total_pages; current_page++) {

            System.out.println("\n--- Scraping Page " + current_page + " ---");

            Thread.sleep(5000);

            List<WebElement> items = driver.findElements(By.xpath("//div[contains(@data-id,\"CPU\")or contains(@data-id,\"MP\")]/div/a[2]"));

            for (WebElement item : items) {
                System.out.println(item.getAttribute("Title"));
            }
            if (current_page < total_pages) {
                try {
                    WebElement nextButton = driver.findElement(By.xpath("//a[normalize-space()=\"Next\"]"));
                    nextButton.click();
                } catch (Exception e) {
                    System.out.println("Next button not found or click failed.");
                    break;
                }

            }

        }
        driver.quit();
    }
}
