package com.demoweb.demo.testbase;


import com.demoweb.demo.propertiereader.PropertyReader;
import com.demoweb.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser= PropertyReader.getInstance().getProperty("browser");;


    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);



    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();


    }
}
