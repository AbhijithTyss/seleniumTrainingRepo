package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestScript extends BaseClass{
	@Test
	public void login() {
		Reporter.log("Navigate to url",true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Click on login link",true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("provide valid credentials",true);
		driver.findElement(By.id("Email")).sendKeys("abhi1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhi@123");
		Reporter.log("Click on login button",true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.fail();
	}
}
