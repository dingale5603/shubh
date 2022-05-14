package suit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testcase1() {
		Reporter.log("first test case",true);
	}
	@Test
	public void testcase2() {
		Reporter.log("second test case",true);
		Assert.fail();
	}
	@Test
	public void testcase3() {
		Reporter.log("third test case",true);
	}

}
