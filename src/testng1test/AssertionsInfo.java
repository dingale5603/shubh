package testng1test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInfo {
	@Test
	public void a1() {
		String first="test";
		String second ="test";
		Assert.assertEquals(first, second);
	}
	
	@Test
	public void a2() {
		String first="test";
		String second ="test";
		Assert.assertNotEquals(first,second);
	}
	@Test
	public void a3() {
		 boolean status = true;
		Assert.assertTrue(status);
	}
	@Test
	public void a4() {
		 boolean status = true;
		Assert.assertFalse(status);
	}
	@Test
	public void a5() {
		 String a="deepak";
		Assert.assertNull(a);
	}
	@Test
	
	public void a6() {
		 String a="deepak";
		Assert.assertNotNull(a);
	}
	
}
