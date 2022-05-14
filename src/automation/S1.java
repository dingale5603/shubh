package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {
	static WebDriver driver;
	static String shubh;
	static String deep;
	public void selconfig() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", Config.path);
	    driver=new ChromeDriver();
		driver.get(Config.url);
		Thread.sleep(1000);
		Util.screen();
		Util.takefileinfo();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(deep);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(shubh);
		Util.screen();
		
	}

}
