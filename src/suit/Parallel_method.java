 package suit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class Parallel_method {
    @Test
	public void openborw() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.facebook.com"); 
		 
	}
    @Test
	public void openborw1() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.amazon.com"); 
		 
	}
    @Test
	public void openborw2() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.flipkart.com"); 
		 
	}
    @Test
	public void openborw3() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.facebook.com"); 
		 
	}
}
