package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {
	
	WebDriver driver;
	
	By cart = By.xpath("//span[@id='nav-cart-count']");
	By totalcart = By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]");
	By item1 = By.xpath("(//div[contains(@class,'a-section a-spacing-small puis')]/descendant::a/child::h2/child::span)[1]");
	By item1cart = By.xpath("//input[@id='add-to-cart-button']");
	By item2 = By.xpath("(//div[contains(@class,'a-section a-spacing-small puis')]/descendant::a/child::h2/child::span)[3]");
	By item2cart = By.xpath("//input[@id='add-to-cart-button']");
	By item3 = By.xpath("(//div[contains(@class,'a-section a-spacing-small puis')]/descendant::a/child::h2/child::span)[5]");
	By item3cart = By.xpath("//input[@id='add-to-cart-button']");
	 	
 	
 	public Cartpage(WebDriver driver) {
 		this.driver=driver;
 		}
 	
 	public void clickOnCart() {
		driver.findElement(cart).click();
	}
	public String clickOnTotalcart() {
		return driver.findElement(totalcart).getText();
	}
	
	public void clickOnItem1() {
		driver.findElement(item1).click();
	}
	public void clickOnItem1cart() {
		driver.findElement(item1cart).click();
	}
	
	public void clickOnItem2() {
		driver.findElement(item2).click();
	}
	public void clickOnItem2cart() {
		driver.findElement(item2cart).click();
	}
	
	
	public void clickOnItem3() {
		driver.findElement(item3).click();
	}
	public void clickOnItem3cart() {
		driver.findElement(item3cart).click();
	}
	
	
	public void switchwindow() {
		String Mainpage = driver.getWindowHandle();
		Set<String> page1 = driver.getWindowHandles();
		for(String page:page1) {
			if(!page.equals(Mainpage)){
				driver.switchTo().window(page);
				
			}
		}
		//driver.close();
	}
	
	public  void windowClose() {
		//String Mainpage = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			String data = driver.switchTo().window(window).getTitle();
			System.out.println(data);
			if (data.equals(window)) {
				driver.close();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
			}
		}
		
		//driver.switchTo().window(Mainpage);
	}
	
	public void switchWindows() {
		Set<String> s = driver.getWindowHandles();
		ArrayList ar = new ArrayList(s);
//		System.out.println(ar.get(0));
//		System.out.println(ar.get(1));
//		
//		driver.switchTo().window((String)ar.get(1));
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().window((String)ar.get(0));
	}

}
