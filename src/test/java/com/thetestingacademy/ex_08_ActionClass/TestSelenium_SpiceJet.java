package com.thetestingacademy.ex_08_ActionClass;

import com.thetestingacademy.Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class TestSelenium_SpiceJet extends CommonToAll {

    @Test
    public void test_SpiceJet(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        //from xpath
        //CSS --> div[data-testid="to-testID-origin"] >div>div>input
        //xpath -->//div[@data-testid="to-testID-origin"]/div/div/input
        //xpath --> //div[@data-testid="to-testID-origin"]/descendant::input


        //find element --> move to element and then click, sendKeys("BLR")
        //destination xpath --> //div[@data-testid="to-testID-destination"]/descendant::input

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input")));

        WebElement from_input= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(from_input).click().sendKeys("BLR").build().perform();

        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));

        actions.moveToElement(destination).click().sendKeys("DEL").build().perform();


        closeBrowser(driver);
    }


}
