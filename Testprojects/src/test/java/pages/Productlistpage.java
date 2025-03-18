package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productlistpage {
	
	private WebDriver driver;
 	
 	private By productNames= By.xpath("//div[contains(@class,'a-section a-spacing-small puis')]/descendant::a/child::h2/child::span");
 	 private By productPrice= By.xpath("//div[contains(@class,'a-section a-spacing-small puis')]/descendant::div[contains(@class,'a-row')]/descendant::span[@class='a-price-whole']");
 	
 	
 	public Productlistpage(WebDriver driver) {
 		this.driver=driver;
 	}
 	
 	public List<String[]> getProducts(){
 		List<WebElement> names = driver.findElements(productNames);
 		List<WebElement> prices = driver.findElements(productPrice);
 	
 
 	List<String[]> productData= new ArrayList<>();
 	for(int i=0;i<Math.min(names.size(),prices.size()); i++) {
 		String name = names.get(i).getText();
 		String price = prices.get(i).getText();
 		System.out.println(name);
 		System.out.println(price);
 		 productData.add(new String[]{name, price});
 	}	
 	
 	return productData;
 	}

}
