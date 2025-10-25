package com.thetestingacademy.ex_08_ActionClass;

import com.thetestingacademy.Utils.CommonToAll;
import com.thetestingacademy.ex_07_WaitHelper.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Lab34_Action_MakeMyTrip extends CommonToAll {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));

        closeModal.click();

        new WaitHelpers().waitJVM(5000);

        WebElement fromCity= driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));

        WebElement toCity=driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        new WaitHelpers().waitJVM(3000);


        List<WebElement> list_auto_complete= driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        try {
            for(WebElement e: list_auto_complete){
                if(e.getText().contains("Chandigarh")) {
                    e.click();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        actions.moveToElement(toCity).click().sendKeys("DEL").build().perform();
        new WaitHelpers().waitJVM(3000);

        List<WebElement> list2_auto_complete= driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        try {
            for(WebElement e: list2_auto_complete){
                if(e.getText().contains("Delhi")) {
                    e.click();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();


    }
}
