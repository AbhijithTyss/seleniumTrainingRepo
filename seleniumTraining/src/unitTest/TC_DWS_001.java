package unitTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 {// TestNG class
	
	@Test
	public void test() {
		Reporter.log("test executing....",true);
	}
	
	@Test
	public void demo() {// test case
		// test steps
		Reporter.log("demo executing....",true);
	}
	
}
