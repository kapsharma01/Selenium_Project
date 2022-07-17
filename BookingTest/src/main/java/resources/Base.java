package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public WebDriver driver;
	
	public WebDriver InitializeBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kapsharma\\Downloads\\eclipse\\BookingTest\\drivers\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public void screenShot(WebDriver webdriver,String fileWithPath) throws Exception{
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}
	

}
