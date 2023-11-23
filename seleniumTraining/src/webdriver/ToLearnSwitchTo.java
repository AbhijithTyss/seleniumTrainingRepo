package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id :allWindowIds) {
			driver.switchTo().window(id);
			Thread.sleep(1000);
			if (driver.getCurrentUrl().equals("https://www.flipkart.com/")) {
				driver.close();
			}
		}	
	}
}