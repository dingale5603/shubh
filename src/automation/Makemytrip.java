package automation;
//how to handle suggestion in make my trip
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Makemytrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|ETA|Regular|V2|261710630333&s_kwcid=AL!1631!3!261710630333!e!!g!!makemy&ef_id=CjwKCAiA-9uNBhBTEiwAN3IlNGnymHeMgv1vQ46ujvS8o0iXdTlIZ8F9sCWXIoX_YNGNWKZv5dVH-hoC9psQAvD_BwE:G:s&gclid=CjwKCAiA-9uNBhBTEiwAN3IlNGnymHeMgv1vQ46ujvS8o0iXdTlIZ8F9sCWXIoX_YNGNWKZv5dVH-hoC9psQAvD_BwE");
	WebElement a = d.findElement(By.xpath("//div[@id=\"root\"]"));
		a.click();
	 Thread.sleep(2000);
	// d.findElement(By.xpath("//div[@class=\"langCard  fixedCard bounceAni\"]//span[@class=\"langCardClose\"]"));
	// d.switchTo().alert().dismiss();
	// Thread.sleep(2000);
	 d.findElement(By.xpath("//span[text()='From']")).click();
	 
	 
	 Thread.sleep(2000);
	// WebElement element = d.findElement(By.xpath("//div[@class=\"langCard  fixedCard bounceAni\"]"));
	//	((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView(true)", element);
	
	 WebElement sel = d.findElement(By.xpath("(//input[@type='text'])[1]"));
	  sel.sendKeys("Mumbai");
	  Thread.sleep(2000);
	  sel.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);

	  sel.sendKeys(Keys.ENTER);
	  
	  Thread.sleep(2000);
	
	
	
	
	
	
	
	}

}
