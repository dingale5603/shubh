package automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	static WebDriver driver;

	
	public void a1() throws IOException{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String currentdate=d.toString();
		currentdate=currentdate.replace(":", "_");
		File des=new File("C:\\Users\\Admin\\Desktop\\new\\"+currentdate+"img.jpg");
	    FileHandler.copy(src, des);
	
		
	}
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", Config.path);
	    driver=new ChromeDriver();
		driver.get(Config.url);
		Thread.sleep(1000);
		Screenshot take=new Screenshot();
		take.a1();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("deepak");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ingale");
		take.a1();
	}
	

}
