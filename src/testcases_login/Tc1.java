package testcases_login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.Config;
import element.Pom1;
import utility.Util;

public class Tc1 {
	public static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", Config.path);
	
    driver=new ChromeDriver();
	driver.get(Config.url);
	Pom1 p=new Pom1(driver);
	Util ne=new Util();
	
		Thread.sleep(2000);
    p.fname(ne.excel(0, 0)); 
    Thread.sleep(2000);
	p.lname(ne.excel(0, 1));
	ne.screen();

	Thread.sleep(2000);
	

	
}
	}