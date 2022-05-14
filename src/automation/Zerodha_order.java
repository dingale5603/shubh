package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zerodha_order {
	
	
	@Test
	public void luanch() {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/orders");
		WebElement orders = driver.findElement(By.xpath("//a[@aria-current=\"page\"]/span"));
		orders.click();
	}

}
