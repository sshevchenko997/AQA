package com.mycompany.app.my_app;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Script2 extends Configuration  {

	public void tologin(WebDriver driver) {
	    			
	String[] MenusItemsWithcssClassContainer = { "Заказы", "Клиенты", "Служба поддержки", 
		 			 "Design", "Доставка", "Способ оплаты", "Конфигурация"};	
		 		
	for (int i = 0;i < MenusItemsWithcssClassContainer.length;i++) {
		driver.findElement(By.linkText(MenusItemsWithcssClassContainer[i])).click();
		driver.navigate().refresh();
		Assert.assertEquals(MenusItemsWithcssClassContainer[i],driver.findElement(By.cssSelector(".breadcrumb-container")).getText());
		System.out.println(MenusItemsWithcssClassContainer[i]);
			}	 		
	
	
	String[] MenusItemsWithcssClassBreadcrumb = { "Каталог", "Modules",};	
	 	
	for (int i = 0;i < MenusItemsWithcssClassBreadcrumb.length;i++) {
		driver.findElement(By.linkText(MenusItemsWithcssClassBreadcrumb[i])).click();
		driver.navigate().refresh();
		Assert.assertEquals(MenusItemsWithcssClassBreadcrumb[i],driver.findElement(By.cssSelector(".breadcrumb>li>a")).getText());
		System.out.println(MenusItemsWithcssClassBreadcrumb[i]);
			}	
	
	
	String[] MenusItemsWithCssClassCurrent = {"Dashboard", "Статистика"};	
	for (int i = 0;i < MenusItemsWithCssClassCurrent.length;i++) {
		driver.findElement(By.linkText(MenusItemsWithCssClassCurrent[i])).click();
		driver.navigate().refresh();
		Assert.assertEquals(MenusItemsWithCssClassCurrent[i],driver.findElement(By.cssSelector(".breadcrumb-current")).getText());
		System.out.println(MenusItemsWithCssClassCurrent[i]);
		}	
	
	 
	driver.findElement(By.linkText("International")).click();
	driver.navigate().refresh();
	Assert.assertEquals("Локализация",driver.findElement(By.cssSelector(".breadcrumb-container")).getText());
	 
	driver.findElement(By.linkText("Shop Parameters")).click();
	driver.navigate().refresh();
	Assert.assertEquals("Общие настройки",driver.findElement(By.cssSelector(".breadcrumb-container")).getText());
  
	}
	public void logout(WebDriver driver) {
		System.out.println("@Test #2 pass");
		driver.quit();
		}
}
