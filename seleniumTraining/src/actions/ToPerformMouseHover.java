package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		WebElement menLink = driver.findElement(By.partialLinkText("MEN"));
		Actions act=new Actions(driver);
		act.moveToElement(menLink).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Casual Shirts")).click();
	}

}
