package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void a1()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Config.path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/signup");
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");//to scroll down
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,-500)");//to scroll up
	//	Thread.sleep(2000);
	//	((JavascriptExecutor)driver).executeScript("scroll(500,0)");//to scroll right
	//	Thread.sleep(2000);
	//	((JavascriptExecutor)driver).executeScript("scroll(-500,0)");to scroll left
		}
	public static void a2() {
		System.setProperty("webdriver.chrome.driver",Config.path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		 a1();
	}

}
 