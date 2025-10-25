package com.thetestingacademy.ex_09_FileUpload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class Lab37_File_Upload {
    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.awesomeqa.com/selenium/upload.html");

        WebElement upload_File=driver.findElement(By.id("fileToUpload"));
        String user_dir= System.getProperty("user.dir");
        System.out.println(user_dir);

        //C:\Users\h.venkata.rayapudi\IdeaProjects\LearningSeleniumATB13x\src\test\java\com\thetestingacademy\ex_09_FileUpload\testdata.txt

        String path= user_dir+"\\src\\test\\java\\com\\thetestingacademy\\ex_09_FileUpload\\testdata.txt";

        upload_File.sendKeys(path);

        driver.findElement(By.name("submit")).click();




    }
}
