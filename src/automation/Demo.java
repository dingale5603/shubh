package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458712209%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D4729937121069344176%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007786%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26gclid%3DEAIaIQobChMIuN7Bo8Gr9AIVVB0rCh3FxwBBEAAYASAAEgLZNPD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	driver.manage().window().maximize();
	driver.findElement(By.id("ap_email")).sendKeys("8379952705");
	driver.findElement(By.id("continue")).click();
	//driver.findElement(By.xpath("//input[@tabindex=\"6\"]")).click();
	//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("212057");
	//driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();

	
	
	
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Deep@9890");
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(10000);
	driver.close();
	//driver.findElement(By.xpath("login")).sendKeys("abc@gmail.com");
	//driver.findElement(By.id("email"));
	
	
	//Thread.sleep(1000);
	//driver.navigate().to("https://www.google.co.in/");
	//driver.navigate().back();
	//Thread.sleep(2000);
	//driver.navigate().forward();
	//driver.navigate().refresh();
	//Thread.sleep(1000);
	//String a=driver.getTitle();
	//System.out.println(a);
	//driver.close();
	

	}

}
