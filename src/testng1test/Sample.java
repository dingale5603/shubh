package testng1test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
@Test (invocationCount=3)
public void log() {
Reporter.log("test ng log first time",true);
}
@Test (enabled=false)
public void login() {
Reporter.log("test ng login first time",true); 
}
@Test (priority=-4)
public void logout() {
Reporter.log("test ng logout first time",true);
}
@BeforeMethod
public void input() {
	Reporter.log("input",true);
}
@AfterMethod
public void outut() {
	Reporter.log("output",true);
}
@AfterClass
public void closed() {
	Reporter.log("closed browser",true);
}
@BeforeClass
public void luanch() {
	Reporter.log("luanch browser",true);
}


}
