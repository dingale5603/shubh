package automation;
//how to handle alert pop up
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(1000);
	Alert a = d.switchTo().alert();
	
	System.out.println(a.getText());
	a.accept();
		
	}

}
