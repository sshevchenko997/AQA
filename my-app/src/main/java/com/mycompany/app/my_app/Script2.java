package com.mycompany.app.my_app;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	WebDriver driver;
	By email = By.id("email");
	public static final String mail = "webinar.test@gmail.com";
	By passwd = By.id("passwd");
	public static String paswd = "Xcg7299bnSmMuRLp9ITw";
	By submit = By.name("submitLogin");
	static String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
	
		
	public void tologin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sshevchenko\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 		 driver.manage().window().maximize();
		 		 driver.get(url);
		 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 	/*
		 	 * Login part
		 	 */
		 		
		 		driver.findElement(email).sendKeys(mail);
		 		driver.findElement(passwd).sendKeys(paswd);
		 		driver.findElement(submit).click();
    
    /*
     * Dashboard
     */
	System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li")).getText());
    driver.navigate().refresh();
    Assert.assertEquals("Dashboard",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li")).getText());
    
    
    /*
     * Заказы
     */
  driver.findElement(By.id("subtab-AdminParentOrders")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li")).getText());
  driver.navigate().refresh();
  Assert.assertEquals("Заказы",driver.findElement(By.id("subtab-AdminParentOrders")).getText());
  
  
  /*
   * Catalog
   */
  driver.findElement(By.linkText("Каталог")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"main-div\"]/div[1]/ol/li[1]/a")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Каталог",driver.findElement(By.xpath("//*[@id=\"main-div\"]/div[1]/ol/li[1]/a")).getText());
  
  /*
   * Clients
   */
  driver.findElement(By.linkText("Клиенты")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Клиенты",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li")).getText());
  
  
  
  /*
   * Customer Service
   */
  driver.findElement(By.linkText("Служба поддержки")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Служба поддержки",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  
  /*
   * Статистика
   */
  driver.findElement(By.linkText("Статистика")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Статистика",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")).getText());

  /*
   * Modules
   */
  driver.findElement(By.linkText("Modules")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"main-div\"]/div[1]/ol/li/a")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Modules",driver.findElement(By.xpath("//*[@id=\"main-div\"]/div[1]/ol/li/a")).getText());
  
  
  /*
   * Design
   */
  driver.findElement(By.linkText("Design")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Design",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  
  /*
   * Доставка
   */
  driver.findElement(By.linkText("Доставка")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Доставка",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  
  /*
   * Способ оплаты  
   */
  driver.findElement(By.linkText("Способ оплаты")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Способ оплаты",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  
  /*
   * International 
   */
  driver.findElement(By.linkText("International")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Локализация",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li")).getText());
  
  /*
   * Shop Parameters
   */
  driver.findElement(By.linkText("Shop Parameters")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Общие настройки",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  
  /*
   * Конфигурация
   */
  driver.findElement(By.linkText("Конфигурация")).click();
  System.out.println("Success " + driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  Assert.assertEquals("Конфигурация",driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/ul/li[1]")).getText());
  
  driver.close();
	}}
