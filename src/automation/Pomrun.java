package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pomrun {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver driver=new ChromeDriver();
		driver.get(Config.url);
		
		
		Pom p=new Pom(driver);
		p.element1();
		
		p.element2();
		
		
		
		
		
		
	}

}
