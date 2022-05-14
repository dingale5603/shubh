package automation;
import java.awt.AWTException;
import java.awt.Robot;
//how to handle Pop up of child window
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demoqa.com/browser-windows");
		d.findElement(By.xpath("//button[@id='windowButton']")).click();
		 Set<String> alt = d.getWindowHandles();
		System.out.println(alt.size());
		Iterator<String> multitab = alt.iterator();
		while(multitab.hasNext()) {
	    String firsttab = multitab.next();
	    String secondtab = multitab.next();
     	System.out.println("main page "+firsttab);
	    System.out.println("child page "+secondtab);
	
	    d.switchTo().window(secondtab);
	    d.manage().window().maximize();
	    System.out.println(d.getTitle());
	    Thread.sleep(1000);
	      
	    
	}
}
}