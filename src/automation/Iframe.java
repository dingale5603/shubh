package automation;
//how to handle i-frame
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d=new ChromeDriver();
		d.get(Config.url);
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    
		d.switchTo().frame("iframeResult");//here we switch to child frame by name as iframeResult
		d.findElement(By.xpath("//button[@type='button']")).click();
		//d.switchTo().defaultContent();//to come back to main page
		d.switchTo().parentFrame();//to come back to parent of child frame
		 
	
		
	}

}
