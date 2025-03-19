package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basetest;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pages.Cartpage;
import pages.Homepage;
import pages.Productlistpage;
import utilites.Excelutilites;

public class Test01 extends Basetest{
	
	@Test
 	public void testEcommerce() throws Exception{
 		driver.navigate().to("https://www.amazon.in/");
 		
 		Homepage homePage = new Homepage(driver);
 		homePage.searchProduct("shirt");
 		
 		Productlistpage product = new Productlistpage(driver);
 		List<String[]> products = product.getProducts();
 		
 		Excelutilites.writeToExcel(products);
 		
 		Cartpage cart = new Cartpage(driver);
 		cart.addItem1();
 		cart.addItemsTocart();
 		Thread.sleep(6000);
 		System.out.println("Switched to chilid window");
 		cart.addItem01();
 		System.out.println("Item added to cart");
 		Thread.sleep(6000);
// 		cart.addItem2();
// 		cart.addItemsTocart();
// 		Thread.sleep(6000);
// 		System.out.println("Switched to chilid window");
// 		cart.addItem02();
// 		System.out.println("Item added to cart");
// 		Thread.sleep(6000);
 		cart.clickonCart();
 		Thread.sleep(6000);
 		String totalitemsprice = cart.cartTotal();
 		System.out.println("Total price in cart :" + totalitemsprice);
 		Assert.assertNotNull(totalitemsprice);
 		
 	}

}
