package com.digitalbooking.Page;

import com.digitalbooking.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageSearch extends BasePage {
    By ciudad = By.id("ciudad");
    By searchButton = By.id("btn-buscador");


    public PageSearch(WebDriver driver){
    }

    public void clickearBtnSearch() throws InterruptedException {
        clickear(searchButton);
    }


    public void ingresarCiudad(String city) throws InterruptedException{
        escribirCampo(city, ciudad);

    }

    public String resultado(){
     String res = findElement(By.className("card-list")).getText();
        System.out.println("Resultado Card value: " + res);
        return res;
    }

}


