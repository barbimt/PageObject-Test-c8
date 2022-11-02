package com.digitalbooking.Test;

import com.digitalbooking.Page.PageSearch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSearch {
    private WebDriver driver;
    PageSearch pageSearch;

    @BeforeEach
    public void setUp() throws Exception {
        pageSearch = new PageSearch(driver);
        driver = pageSearch.chromeDriverConnection();
        pageSearch.link("http://fe.deitech.online/");
    }

    @Test
    public void SearchExitoso() throws InterruptedException{
        pageSearch.ingresarCiudad("punta del este");
        pageSearch.clickearBtnSearch();
        assertTrue(pageSearch.resultado().contains("Villa Kantounes Studio Ostria"));
    }


    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }


}
