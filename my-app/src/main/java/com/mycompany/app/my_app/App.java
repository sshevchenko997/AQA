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
    	
    	/**
    	@Test #1
    	*/
    	LoginPage p = new LoginPage();
    	p.openWeb();
    	p.enterEmail();
    	p.enterPasswrd();
    	p.enterSubmit();
    	p.clikcUserIcon();
    	p.clickLogOut();
    	p.printLog();
    	

    	/**
    	@Test #2
    	*/
    	LoginPage l = new LoginPage();
    	l.openWeb();
    	l.enterEmail();
    	l.enterPasswrd();
    	l.enterSubmit();
    	WebDriver b = l.setdriver();
    	Script2 t = new Script2();
    	t.tologin(b);
    	t.logout(b);
    }
}
