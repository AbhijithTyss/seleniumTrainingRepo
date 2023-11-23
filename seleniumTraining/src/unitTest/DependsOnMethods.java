package unitTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test()
	public void register() {
//		Assert.fail();
		Reporter.log("User registered successfully", true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("User logged in successfully", true);
	}
}
