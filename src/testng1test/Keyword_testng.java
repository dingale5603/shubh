package testng1test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_testng {
	@Test (timeOut=1000)          //this test  case fail if it takes more than 1sec
	public void log() throws InterruptedException {
	Reporter.log("test ng log first time",true);
	Thread.sleep(3000);
	}
	@Test (dependsOnMethods="logout")     //depends on means if logout test case pass then it will run other wise it skipped
	public void login() {
	Reporter.log("test ng login first time",true); 
	}
	@Test (priority=-4)
	public void logout() {
	Reporter.log("test ng logout first time",true);

	}
}
