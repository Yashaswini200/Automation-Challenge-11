package org.example.driver;

import org.example.Utlis.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {
    public static WebDriver driver;
    public  static WebDriver getDriver(){
        return driver;
    }
    public static void setDriver(WebDriver driver){
        DriverManager.driver=driver;
    }
    public static void init(){
String browser= PropertiesReader.readKey("browser");
browser=browser.toLowerCase();
switch (browser){
    case "edge":
        EdgeOptions edgeOptions=new EdgeOptions();
        driver=new EdgeDriver(edgeOptions);
        break;
    case "chrome":
        ChromeOptions chromeOptions=new ChromeOptions();
        driver=new ChromeDriver(chromeOptions);
        break;
    case "firefox":
        FirefoxOptions fireFoxOptions=new FirefoxOptions();
        driver=new FirefoxDriver(fireFoxOptions);
        break;
    default:
        System.out.println("enter the correct browser name");
}

    }
    public static void down(){
        if(getDriver()!=null){
            driver.quit();
            driver=null;
        }
    }
}
