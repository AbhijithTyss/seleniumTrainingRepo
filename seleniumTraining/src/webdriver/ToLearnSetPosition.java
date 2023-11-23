package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetPosition {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(500, 500));
	}

}
