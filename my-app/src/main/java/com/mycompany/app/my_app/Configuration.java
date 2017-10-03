package com.mycompany.app.my_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Configuration {
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 return new ChromeDriver();
		 
		 }
}



    
