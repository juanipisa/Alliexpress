package Config;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown {

	WebDriver driver = new ChromeDriver();

    @After
    public void quitDriver(Scenario scenario) throws Exception{
 
    	this.takeSnapShot(driver, "Alliexpress\\Screenshots\\test.png") ; 
        this.driver.quit();
    }

    public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

        File DestFile=new File(fileWithPath);

                //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }

}