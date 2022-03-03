package com.qa.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class launchTest {
    public  WebDriver driver;

@BeforeMethod
    public void setup() throws InterruptedException, IOException {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("headless");
    WebDriverManager.chromedriver().version("98.0.4758.102").setup();
    driver= new ChromeDriver(chromeOptions);
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();



    }

@Test(priority = 1)
public void launch(){

}
@AfterMethod
public void clean(){
    driver.quit();
}
}
