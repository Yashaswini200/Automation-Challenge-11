package org.example.test;

import org.example.ACME.LoginPage;
import org.example.ACME.Totalpage;
import org.example.Utlis.PropertiesReader;
import org.example.base.CommonToAllTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.driver.DriverManager.getDriver;

public class TestACME extends CommonToAllTest {
    @Test
    public void testlogin(){
        LoginPage login=new LoginPage(getDriver());
        login.loginusingurl( PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demo.applitools.com/app.html");
        Totalpage total=new Totalpage();
 total.totaltable();




        }

    }

