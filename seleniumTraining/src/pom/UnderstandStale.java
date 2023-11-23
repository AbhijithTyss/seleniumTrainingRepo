package pom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandStale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement searchBtn = driver.findElement(By.id("small-searchterms"));
//		searchBtn.click();
//		driver.navigate().refresh();
//		searchBtn.click();
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getVoteButton().click();
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		Thread.sleep(1000);
		wp.getVoteButton().click();
	}
}
