package com.mycompany.app.my_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage {
	
	WebDriver driver;
	By email = By.id("email");
	public static final String mail = "webinar.test@gmail.com";
	By passwd = By.id("passwd");
	public static String paswd = "Xcg7299bnSmMuRLp9ITw";
	By submit = By.name("submitLogin");
	static String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
	By userIcon = By.id("employee_infos");
	By logout = By.id("header_logout");
	
	public void tologin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sshevchenko\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 		 driver.manage().window().maximize();
		 		 driver.get(url);
		 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	driver.findElement(email).sendKeys(mail);
	driver.findElement(passwd).sendKeys(paswd);
    driver.findElement(submit).click();
    driver.findElement(userIcon).click();
    driver.findElement(logout).click();
    System.out.println("Login and Logout work properly");
    driver.close();
}
		
}