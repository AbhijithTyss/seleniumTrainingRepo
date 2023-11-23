package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	
public class BasicVerification {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		Assert.assertEquals(driver.getTitle(), "Demo Web", "user failed to login");
//		Reporter.log("user logged in successfully",true);
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(driver.getTitle(), "Demo Web", "user failed to login");
		Reporter.log("user logged in successfully",true);
		softassert.assertAll();
	}
}
