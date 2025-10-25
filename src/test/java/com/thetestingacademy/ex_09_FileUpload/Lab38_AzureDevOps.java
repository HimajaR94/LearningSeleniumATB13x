package com.thetestingacademy.ex_09_FileUpload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab38_AzureDevOps {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://dev.azure.com/accenturecio22/HRPEnablingServices_PR1158/_workitems/edit/1444920");

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label=\"Attachments\"]")));

        WebElement Attachment_tab=driver.findElement(By.xpath("//div[@aria-label=\"Attachments\"]"));

        Attachment_tab.click();
//
//        WebElement Add_Attachment_button= driver.findElement(By.xpath("//button[contains(@class,\"add-attachment-button\")]"));
//        Add_Attachment_button.click();


        WebElement File_Upload= driver.findElement(By.xpath("//div[@class=\"work-item-form-collapsible-section-content\"]/input"));




        //"C:\Users\h.venkata.rayapudi\OneDrive - Accenture\Workday\Skills\New Features\Feature 1444920\Bug 1537098 retest evidence.xlsx"



        String path="C:\\Users\\h.venkata.rayapudi\\OneDrive - Accenture\\Workday\\Skills\\New Features\\Feature 1444920\\Bug 1537098 retest evidence.xlsx";

        File_Upload.sendKeys(path);





    }
}
