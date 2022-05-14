package automation;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d=new ChromeDriver();
		d.navigate().to(Config.url);
		WebElement day = d.findElement(By.xpath("//select[@name='birthday_day']"));
	  Actions act=new Actions(d);
	  act.moveToElement(day).click().perform();
	
	for(int i=0; i<=13;i++) {
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	
	}
	}

}
