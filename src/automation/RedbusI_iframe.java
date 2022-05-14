package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusI_iframe {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.redbus.in/");
	
 d.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
 d.findElement(By.xpath("//li[@id='signInLink']")).click();
WebElement a = d.findElement(By.xpath("//iframe[@Class='modalIframe']"));
 d.switchTo().frame(a);
 d.findElement(By.xpath("(//input[@Class='IP'])[1]")).sendKeys("9896563656");


}
}
