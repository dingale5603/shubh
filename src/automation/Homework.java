//print all options available in DOM of facebook sign up page for day,month and year
package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to(Config.url);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select=new Select(day);
		List<WebElement> list = select.getOptions(); //to get all options from DOM structure
		System.out.println(list.size()); // get size of list
		for(int i=0;i<=list.size()-1;i++) {
 		System.out.println(list.get(i).getText()); //get text of all options in list
		Thread.sleep(100);
		}
		WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select select1=new Select(Month);
	
		List<WebElement> list1 = select1.getOptions(); 
		System.out.println(list1.size());
		for(int i=0;i<=list1.size()-1;i++) {
		System.out.println(list1.get(i).getText());
		Thread.sleep(100);
		}
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select2=new Select(year);
		List<WebElement> list2 = select2.getOptions();
		System.out.println(list2.size());
		for(int i=0;i<=list2.size()-1;i++) {
		System.out.println(list2.get(i).getText());
		Thread.sleep(100);
		}
		
		
		WebElement m = select.getFirstSelectedOption();//get first selected option for date option
		System.out.println(m.getText());
	
		WebElement n = select1.getFirstSelectedOption();
		System.out.println(n.getText());
		
		WebElement o = select2.getFirstSelectedOption();
		System.out.println(o.getText());
	}

}
