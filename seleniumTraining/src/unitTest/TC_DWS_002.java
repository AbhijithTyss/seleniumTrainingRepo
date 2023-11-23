package unitTest;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {
	@Test
	public void addProduct() {
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Reporter.log("product added successfully",true);
	}
}