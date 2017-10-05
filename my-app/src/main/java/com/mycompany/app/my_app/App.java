package com.mycompany.app.my_app;

import org.openqa.selenium.WebDriver;

/**
 * AQA tests
 * created by @author sshevchenko 9/21/2017
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	
    	WebDriver driver = Configuration.getConfifuredDriver();
    	
    	
    	/**
    	@Test #1
    	*/
    	LoginPage p = new LoginPage();
    	p.openWeb(driver);
    	p.enterEmail(driver);
    	p.enterPasswrd(driver);
    	p.enterSubmit(driver);
    	p.clikcUserIcon(driver);
    	p.clickLogOut(driver);
    	p.printLog(driver);
    	
    	/**
    	@Test #2
    	*/
    	WebDriver driver1 = Configuration.getConfifuredDriver();
    	LoginPage l = new LoginPage();
    	l.openWeb(driver1);
    	l.enterEmail(driver1);
    	l.enterPasswrd(driver1);
    	l.enterSubmit(driver1);
    	Script2 t = new Script2();
    	t.tologin(driver1);
    	t.logout(driver1);
    	
    	/**
    	@Test #3
    	*/
    	WebDriver driver3 = Configuration.getConfifuredDriver();
    	LoginPage k = new LoginPage();
    	k.openWeb(driver3);
    	k.enterEmail(driver3);
    	k.enterPasswrd(driver3);
    	k.enterSubmit(driver3);
    	Script3 t3 = new Script3();
    	t3.getToCategory(driver3);
    	t3.addNewCategory(driver3);
    	t3.MessageAfterCreation(driver3);
    	t3.FilterCategoryByName(driver3);
    	t3.CheckCategoryCreation(driver3);
    	t3.logout(driver3);
    	
    }
}
