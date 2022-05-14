package suit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testcase4() {
		Reporter.log("fourth test case",true);
		Assert.fail();
	}
	@Test
	public void testcase5() {
		Reporter.log("fifth test case",true);
	}
	@Test
	public void testcase6() {
		Reporter.log("sixth test case",true);
	}
}
