package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);//8BD6
	}

}
