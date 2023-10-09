package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	public Properties dataProp;

     public Base() {
		
		prop = new Properties();
		File propFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");
		
		dataProp = new Properties();
		File dataPropFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\testdata\\testdata.properties");
		
		try {
			FileInputStream dataFis = new FileInputStream(dataPropFile);
			dataProp.load(dataFis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
	}
	
	public WebDriver initializeBrowserAndOpenApplicationURL(String browserName) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		/*options.addArguments("--disable notificatios");
		DesiredCapabilities cp= new DesiredCapabilities();  
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);*/
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			
		}else if(browserName.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();		
		}		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.get(prop.getProperty("url"));
		
	    JavascriptExecutor js=(JavascriptExecutor)driver;

		
		
		return driver;
		
	}

}
