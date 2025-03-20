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
 		cart.clickOnItem1();
		//Thread.sleep(5000);
		cart.switchwindow();
		cart.clickOnItem1cart();
		//Thread.sleep(5000);
		cart.switchWindows();
		cart.clickOnItem2();
		//Thread.sleep(5000);
		cart.switchwindow();
		cart.clickOnItem2cart();
		//Thread.sleep(5000);
		cart.switchWindows();
		//Thread.sleep(3000);
		cart.clickOnItem3();
		//Thread.sleep(5000);
		cart.switchwindow();
		cart.clickOnItem3cart();
		//Thread.sleep(5000);
		cart.switchWindows();
		//Thread.sleep(3000);
		cart.clickOnItem1();
		//Thread.sleep(5000);
		cart.switchwindow();
		cart.clickOnItem1cart();
		//Thread.sleep(5000);
		cart.switchWindows();
		cart.clickOnCart();
		String totalprice = cart.clickOnTotalcart();
		//Thread.sleep(3000);
		System.out.println("total price in cart :"+ totalprice);
		Assert.assertNotNull(totalprice);
 		
 	}

}
