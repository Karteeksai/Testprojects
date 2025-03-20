package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	private WebDriver driver;
 	private By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
 	private By searchbutton = By.id("nav-search-submit-button");
 	
 	
 	public Homepage(WebDriver driver) {
 		this.driver=driver;
	}
	public void searchProduct(String productName) throws Exception{
 		driver.findElement(searchBox).sendKeys(productName);
 		//Thread.sleep(3000);
 		driver.findElement(searchbutton).click();
 		//Thread.sleep(3000);
 	}

}
