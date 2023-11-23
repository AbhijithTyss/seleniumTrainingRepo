package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Insta")) {
			System.out.println("User navigated to web app");
		} else {
			System.out.println("User failed to navigate");
		}
	}
}
