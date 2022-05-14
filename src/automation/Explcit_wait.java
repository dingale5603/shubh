package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explcit_wait {
	@Test
	public static void m1() {
		System.setProperty("webdriver.chrome.driver",Config.path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
	
	WebDriverWait wait=new 	WebDriverWait(driver,5);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	
	}

}
