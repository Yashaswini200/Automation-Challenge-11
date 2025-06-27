package org.example.base;

import org.example.Utlis.PropertiesReader;
import org.openqa.selenium.By;

import static org.example.driver.DriverManager.getDriver;

public class CommonToAllPage {
public  static void openurl(){
    getDriver().get(PropertiesReader.readKey("url"));
}
public static void input(By by,String key){
    getDriver().findElement(by).sendKeys(key);
}
public static void clickelement(By by){
    getDriver().findElement(by).click();
}public static int tablesize(By tb){
       int one= getDriver().findElements(tb).size();
return one;
    }


}
