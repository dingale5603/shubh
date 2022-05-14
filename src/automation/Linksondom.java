package automation;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksondom {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d = new ChromeDriver();
		d.navigate().to(Config.url);
		List<WebElement> alllinks = d.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		Iterator<WebElement> itr = alllinks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}

		TreeSet s = new TreeSet();
		Iterator<WebElement> link = alllinks.iterator();
		while (link.hasNext()) {
			s.add(link.next().getText());
		}
		System.out.println(s);

	}

}
