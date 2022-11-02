package com.digitalbooking.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    private WebDriver driver;

    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    };

    public void link(String url) {
        driver.get(url);
    }

    public void clickear(By locator) throws InterruptedException {
        driver.findElement(locator).click();
        Thread.sleep(5000);
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void escribirCampo(String imputText, By locator) throws InterruptedException {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(imputText);
        Thread.sleep(2000);
        driver.findElement(locator).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

}
