package element;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Util;

public class Pom1 {
	
	
	
@FindBy(xpath="//input[@name='firstname']") private WebElement firstname;
@FindBy(xpath="//input[@name='lastname']") private WebElement lastname;


public Pom1(WebDriver driver){

	PageFactory.initElements(driver, this);
}

public void fname(String fname) throws InterruptedException, IOException {
	firstname.sendKeys(fname);
	Thread.sleep(1000);
	
}

public void lname(String lname) throws InterruptedException, IOException {
	lastname.sendKeys(lname);
	
	Thread.sleep(1000);
	
}


}
