package com.mycompany.app.my_app;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class Script3 {
			
	public void getToCategory(WebDriver driver) {
		WebElement Catalog = driver.findElement(By.linkText("Каталог"));
		WebElement Category = driver.findElement(By.xpath("//*[@id=\"subtab-AdminCategories\"]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Catalog).click(Category).build().perform();
		 }
	public void addNewCategory(WebDriver driver) {
		driver.findElement(By.id("page-header-desc-category-new_category")).click();
		driver.findElement(By.id("name_1")).sendKeys("New Categoty test Name");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, $(document).height())");
		driver.findElement(By.id("category_form_submit_btn")).click();
		}
	
	public void MessageAfterCreation(WebDriver driver) {
		String MessageText = driver.findElement(By.cssSelector("div.alert.alert-success")).getText();
		Assert.assertTrue("Text not found!", MessageText.contains("Создано"));
		}
	public void FilterCategoryByName(WebDriver driver) {
		driver.findElement(By.cssSelector(".icon-caret-up")).click();
		
				}
	public void CheckCategoryCreation(WebDriver driver) {
		String catName = driver.findElement(By.xpath("//td[contains(text(),'New Categoty test Name')]")).getText();
		Assert.assertTrue("Text not found!", catName.contains("New Categoty test Name"));
			}
	public void logout(WebDriver driver) {
		System.out.println("@Test #3 pass");
		driver.quit();
		}
	}
