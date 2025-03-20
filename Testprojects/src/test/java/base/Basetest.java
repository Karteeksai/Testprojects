package base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	
public  WebDriver driver;


 	@Parameters("browser")
 	@BeforeClass
 	public void setUp(String browser) throws IOException {
 		
 		
 		switch (browser.toLowerCase()) {
		case "chrome":WebDriverManager.chromedriver().setup();
 		driver = new ChromeDriver();
		break;
		case "edge":WebDriverManager.edgedriver().setup();
 		driver = new ChromeDriver();
 		break;
		case "firefox":WebDriverManager.firefoxdriver().setup();
 		driver = new ChromeDriver();
		default:
			System.out.println("Invalid Browser name...");
			break;
		}
 		
 		driver.manage().window().maximize();
 	}
 	
 	@AfterClass
 	public void tearDown() {
 		driver.quit();
 	}

}
