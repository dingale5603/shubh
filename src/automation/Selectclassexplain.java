package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selectclassexplain {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(Config.url);
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(date);
		List<WebElement> list = s.getOptions();
		System.out.println(list.size());
		for (WebElement alllist : list) {
		if(	alllist.equals(9)){
			break;
		}		
		}
		
		for (int i = 0; i <= list.size(); i++) {
		s.selectByIndex(i);
		Thread.sleep(1000);
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());

		boolean multi = s.isMultiple();
		System.out.println(multi);
	}
		}
	}

	
