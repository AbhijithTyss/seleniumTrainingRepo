package listbox;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListbox = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceListbox);
		List<WebElement> allOptions = priceSelect.getOptions();
		System.out.println(allOptions.size());

//		for (WebElement option : allOptions) {
//			System.out.println(option.getText());
//		}
		
		priceSelect.selectByIndex(1);
		priceSelect.selectByIndex(3);
		WebElement firstSelOption = priceSelect.getFirstSelectedOption();
		
//		System.out.println(firstSelOption.getText());
		List<WebElement> allSelOptions = priceSelect.getAllSelectedOptions();
		for(WebElement option:allSelOptions) {
			System.out.println(option.getText());
		}
		
		System.out.println(priceSelect.isMultiple());
	}

}
