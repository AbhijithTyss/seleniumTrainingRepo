package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnId {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("FirstName")).sendKeys("testing");
		
		driver.findElement(By.id("register-button")).click();
	}

}
