//facebook sign up page filling  by automation
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Locatos {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",Config.path);
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String n=driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).getText();
	System.out.println(n);	
	
	
	Thread.sleep(1000);
	
driver.navigate().to(Config.url);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("deepak");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ingale");
driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8399535654");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sdsfsret");
WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select k=new Select(day);
k.selectByValue("3");
WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select l=new Select(month);
l.selectByVisibleText("Feb");
WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select m=new Select(year);
 m.selectByValue("1995");

Thread.sleep(1000);

WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
boolean p = radio.isSelected();
System.out.println(p);
radio.click();
boolean s = radio.isSelected();
System.out.println(s);

Thread.sleep(1000000);

driver.get("https://www.facebook.com/");
WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
boolean b = button.isEnabled();
System.out.println(b);

driver.navigate().to(Config.url);
boolean z = driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
System.out.println(z);
 
String text=driver.findElement(By.xpath("//div[contains(text(),'Create')]")).getText();
System.out.println(text);


//driver.findElement(By.xpath("//input[contains(text(),'last')]")).sendKeys("ingale");
//driver.findElement(By.xpath("")).sendKeys("");
}

}
