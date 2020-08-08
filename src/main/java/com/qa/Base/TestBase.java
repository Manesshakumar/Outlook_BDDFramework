package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase()  {
		try {
			prop = new Properties();		
			FileInputStream io = new FileInputStream("C:\\Users\\user\\Desktop\\Training\\OutlookAutomationTesting\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(io);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe" );
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			driver = new ChromeDriver();
			String url = prop.getProperty("url");
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		}
				
	}

}


