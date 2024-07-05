package com.base;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class TestUtil extends TestBase{
    

   
    
    public static void takescreenshot() throws IOException
    {
    	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshotFile, new File(System.getProperty("user.dir")+"\\test-output\\screenshots\\"+System.currentTimeMillis()+".png"));
      
    }
    
    

}
