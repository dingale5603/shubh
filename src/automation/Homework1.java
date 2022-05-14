package automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Homework1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",Config.path);	
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(Config.url);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("deepak");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ingale");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8399535654");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sdsfsret");
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select=new Select(day);
		select.selectByIndex(2);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select select1=new Select(month);
		select1.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select2=new Select(year);
		select2.selectByValue("1995");
		Thread.sleep(1000);
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio.click();
		
		select.isMultiple();//this method is use to check drop down is single or multiple
		
		List<WebElement> list = select.getOptions();
		System.out.println("---------dates-----------");
		for (int i=0;i<=list.size()-1;i++) {
	 		System.out.println(list.get(i).getText());
		}
		List<WebElement> list1 = select1.getOptions();
		System.out.println("--------------month------------");
		for(int i=0;i<=list1.size()-1;i++) {
		System.out.println(list1.get(i).getText());
		}
		List<WebElement> list2 = select2.getOptions();
		System.out.println("--------------year------------");
		for(int i=0;i<=list2.size()-1;i++) {
		System.out.println(list2.get(i).getText());
		}
	}
}
