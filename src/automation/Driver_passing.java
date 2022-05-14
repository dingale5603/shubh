package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_passing {
	public WebDriver a1() {
		System.setProperty("webdriver.chrome.driver",Config.path);
		WebDriver driver= new ChromeDriver();
		driver.findElement(By.id("username"));
		driver.findElement(By.name("facebook"));
	return driver;
	}

}
