package com.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PageObjects {

    By sendAddress = By.xpath("//input[@id='InputFrom']");
    public static WebDriver cdriver;

    public static WebDriver getDriver () {

        cdriver = new ChromeDriver();
        cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        return cdriver;
    }


    public void enterToPostcode(String strArg1) {

        cdriver = new ChromeDriver();
        cdriver.findElement(sendAddress).sendKeys(strArg1);
        Actions act = new Actions(cdriver);
        act.sendKeys(Keys.TAB).perform();


    }

}
