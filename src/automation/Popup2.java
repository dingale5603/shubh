package automation;
// how to handle alert pop up and sendkey
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demoqa.com/alerts");
        d.findElement(By.xpath("//button[@id='promtButton']")).click();
        Alert child = d.switchTo().alert();
        child.sendKeys("pop up text");
        child.accept();
        Thread.sleep(1000);
        d.close();
      
     
	}

}
 