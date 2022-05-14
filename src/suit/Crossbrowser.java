package suit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
@Test
@Parameters ("browser")
public void openbrowser(String browser) {
	
	if ( browser.equalsIgnoreCase("FireFox")) {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com");
	 
	}else {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com"); 
	 
	}

}
}
