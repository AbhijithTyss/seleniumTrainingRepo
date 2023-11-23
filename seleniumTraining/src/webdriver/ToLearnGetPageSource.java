package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://skillrary.com/");
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
	}
}