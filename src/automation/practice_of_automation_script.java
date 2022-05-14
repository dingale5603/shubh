package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_of_automation_script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"header-text\"]//span[1]")).click();
		
	}

}
