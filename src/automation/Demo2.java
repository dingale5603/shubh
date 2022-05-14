package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver.exe");
	WebDriver w=new FirefoxDriver();
	w.get("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink");
	Dimension d=new Dimension(100,300);
	w.getTitle();
	w.manage().window().setSize(d);
	Point p=new Point(100,-200);
	w.manage().window().setPosition(p);
	Thread.sleep(3000);
	w.close();

	}

}
