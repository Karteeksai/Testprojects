package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartpage {
	
WebDriver driver;
 	
 	
 	By cart= By.xpath("//span[@id='nav-cart-count']");
 	By item1 = By.xpath("//button[@id='a-autoid-7-announce']");
 	By item01 = By.xpath("div[class='a-row puis-atc-variation-element puis-atc-variation-element-B0CRPG3MHV puis-atc-variation-element-selected'] button[type='button']");
 	By item2 = By.xpath("//button[@id='a-autoid-5-announce']");
 	By item3 = By.xpath("//button[@id='a-autoid-8-announce']");
 	
 	
 	public Cartpage(WebDriver driver) {
 		this.driver=driver;
 		}
 	
 	
 	public void addItemsTocart() throws Exception {
 		
 		String mainpage = driver.getWindowHandle();
 		Set<String> page1 = driver.getWindowHandles();
 		for(String page:page1) {
 			if (!page.equals(mainpage)) {
 				driver.switchTo().window(page);
 			}
 		}
 		driver.switchTo().window(mainpage);
 	}
 //		driver.findElement(item1).click();
 //		Thread.sleep(8000);
 //		driver.findElement(item01).click();
 //		Thread.sleep(5000);
 //		driver.switchTo().window(mainpage);
 		
 		
 //		driver.findElement(item2).click();
 //		Thread.sleep(8000);
 //		driver.findElement(item3).click();
 //		Thread.sleep(8000);
 	
 		public void clickonCart() throws Exception{
 			driver.findElement(cart).click();
 			Thread.sleep(3000);
 		}
 	
 	public void addItem1() {
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 		wait.until(ExpectedConditions.elementToBeClickable(item1));
 		driver.findElement(item1).click();
 	}
 	public void addItem01() throws Exception{
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 		wait.until(ExpectedConditions.elementToBeClickable(item01));
 		driver.findElement(item01).click();
 	}
 	public void addItem2() throws Exception{
 		driver.findElement(item2).click();
 		Thread.sleep(3000);
 	}
 	public void addItem3() {
 		driver.findElement(item3).click();
 	}

}
