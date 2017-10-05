package com.mycompany.app.my_app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public abstract class Configuration {
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 return new ChromeDriver();
		  }
	public static EventFiringWebDriver getConfifuredDriver() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		EventFiringWebDriver wrappedDriver = new EventFiringWebDriver(driver);
		wrappedDriver.register(new EventHandler());
		return wrappedDriver;
	}
	}



    
