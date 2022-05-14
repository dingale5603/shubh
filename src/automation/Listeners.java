package automation;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Listeners {
	@Test
public void listeners1() {
	Reporter.log("start test and pass 1st test case",true);
}
	@Test
public void listeners2() {
	Reporter.log(" 2st test case is failed",true);
	Assert.fail();
} 
	@AfterMethod
public void listeners3(ITestResult res) {
	Reporter.log("listeners working",true);
	if(ITestResult.FAILURE==res.getStatus()) {
		System.out.println(res.getStatus());
	}
}
}
