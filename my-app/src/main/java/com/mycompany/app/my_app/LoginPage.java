package com.mycompany.app.my_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Configuration {
	
	WebDriver driver = Configuration.getDriver();
	By email = By.id("email");
	public static final String mail = "webinar.test@gmail.com";
	By passwd = By.id("passwd");
	public static String paswd = "Xcg7299bnSmMuRLp9ITw";
	By submit = By.name("submitLogin");
	static String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
	By userIcon = By.id("employee_infos");
	By logout = By.id("header_logout");
		
	public WebDriver setdriver() {
		return driver;
	}
	
	public void openWeb() {
		driver.manage().window().maximize();
				 		driver.get(url);
		 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void enterEmail() {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void enterPasswrd() {
		driver.findElement(passwd).sendKeys(paswd);
	}
	
	public void enterSubmit() {
    driver.findElement(submit).click();
    
	}
	
	public void clikcUserIcon() {
    driver.findElement(userIcon).click();
    }
	
	public void clickLogOut() {
    driver.findElement(logout).click();
    }
    
	public void printLog() {
	System.out.println("Login and Logout work properly");
	driver.close();
	}
    

	
}