package com.testcases;

import com.base.TestBase;
import com.base.TestUtil;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class demo extends TestBase {

    @BeforeClass
    public void initialize() throws IOException
        {
    	
            setup();
        }

    @Test
    public void demo() throws IOException, InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Leasworks");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
        
    }


    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
}
