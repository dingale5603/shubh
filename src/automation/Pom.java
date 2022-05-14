 package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	
	//Declaration
    @FindBy(xpath="//input[@name='firstname']") private WebElement fname;
	
    @FindBy(xpath="//input[@name='lastname']") private WebElement lname;
 
 
     //Initialization
    Pom(WebDriver a){
		PageFactory.initElements(a, this);
	}
	 
    //First name
    public void element1() {
		fname.sendKeys("deepak");
	}
    
    //Last name
    public void element2() {
		lname.sendKeys("ingale");
	}
    
}
