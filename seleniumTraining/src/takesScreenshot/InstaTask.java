package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class InstaTask {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("testing");
		driver.findElement(By.xpath("//button[text()='Show']")).click();
		File temp = password.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
	}

}
