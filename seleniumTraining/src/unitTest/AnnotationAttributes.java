package unitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	
	@Test(priority = 2,enabled = false)
	public void demoWebShop() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("launched demo web shop",true);
	}
	
	@Test(priority = 1,invocationCount = 10,threadPoolSize = 10)
	public void skillrary() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		Reporter.log("launched skillrary",true);
	}
}
