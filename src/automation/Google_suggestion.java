 package automation;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_suggestion {
	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		System.setProperty("webdriver.chrome.driver", Config.path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("tester");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
	     System.out.println(list.size());
	//  int b = list.size();
	  // list.get(b-1).click();
	     
	   for (WebElement allsugetions : list) {
		if(allsugetions.getText().equals("tester work")) {
			allsugetions.click();
			break;
		}
	}
	   
	   
	   
	   
	   
	   
	   
	   /* Iterator<WebElement> itr = list.iterator();
			while (itr.hasNext()) { 
			
				itr.next().getText();
				if( itr.next().getText().equals("tester work")) {
					
					break;
				}*/

				
			} 
	     
	     
	     
	/*for(int i=0;i<list.size();i++) {
		String out = list.get(i).getText();
		System.out.println(out);
	
	}
	}*/
		
		
		
		
		/*while(alllist.hasNext()) {
		System.out.println(alllist.next().getText().contains("testing tool"));
		break;
		}*/
	
	
	}


