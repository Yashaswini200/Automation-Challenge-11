package org.example.Utlis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelpers {

    public static void checkVisibility(WebDriver driver, By locator,int time){
        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(time));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
