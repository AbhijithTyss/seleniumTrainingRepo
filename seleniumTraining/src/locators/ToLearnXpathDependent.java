package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathDependent {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Macbook Pro M1 Max')]/../..//button[@id='addToCart']")).click();
	}

}
