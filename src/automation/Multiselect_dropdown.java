package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Multiselect_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Config.path);
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		WebElement multi = d.findElement(By.xpath("//select[@name='States']"));
		Select select=new Select(multi);
		select.selectByValue("California");
		Thread.sleep(1000);
		select.selectByIndex(3);
		Thread.sleep(1000);
		select.selectByVisibleText("Texas");
		Thread.sleep(1000);
		List<WebElement> s = select.getAllSelectedOptions();
		System.out.println(s.size());
		
		//if we want all selected options from drop down
		for(int i=0;i<=s.size()-1;i++) {
			System.out.println(s.get(i).getText());
			Thread.sleep(1000);
		}
		
		
		Thread.sleep(1000);
		select.deselectByValue("New York");
		Thread.sleep(1000);
		select.deselectAll();
		}
}