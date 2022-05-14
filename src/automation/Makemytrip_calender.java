package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip_calender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.makemytrip.com");
		d.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
		d.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(2000);
		 WebElement a = d.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][@aria-label=\"Wed Feb 02 2022\"]"));
		/*WebElement b = d.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][@aria-label=\"Fri Apr 01 2022\"]"));
		String flag="false";
		while(flag=="false"){
		if(a==b) {
			d.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][@aria-label=\"Fri Apr 01 2022\"]")).click();
			flag="true";
		}
		else {
			d.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
		}
		}*/
		}
	}
	


