package org.example.base;

import org.example.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {
    @BeforeMethod
    public void setup(){
        DriverManager.init();
    }
    @AfterMethod
    public void teardown(){
        DriverManager.down();
    }
}
