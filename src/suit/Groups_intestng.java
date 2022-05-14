package suit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups_intestng {
@Test (groups="login")
public void a1() 
{
	Reporter.log("1st test case",true);
}
@Test (groups="homepage")
public void a2()
{
	Reporter.log("2nd test case",true);
}
@Test (groups="login")
public void a3() 
{
	Reporter.log("3rd test case",true);
}
@Test (groups="homepage")
public void a4()
{
	Reporter.log("4th test case",true);
}
@Test (groups="login")
public void a5() 
{
	Reporter.log("5th test case",true);
	Assert.fail();
}
@Test
public void a6()
{
	Reporter.log("6th test case",true);
}
}
