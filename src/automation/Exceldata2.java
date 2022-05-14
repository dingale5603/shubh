package automation;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata2 {
	public String excel(int row, int cell) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\Admin\\Desktop\\myexcel1.xlsx");
		Sheet src = WorkbookFactory.create(file).getSheet("Sheet1");
		String all = src.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(all);
		return all;
	}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", Config.path);
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.facebook.com");
	
	Exceldata2 as=new Exceldata2();
	 String a = as.excel(0, 0);
	WebElement email = d.findElement(By.id("email"));
	
	 email.sendKeys(a);
	WebElement pass = d.findElement(By.id("pass"));
	String b = as.excel(0, 1);
	pass.sendKeys(b);
	WebElement login = d.findElement(By.tagName("button"));
	login.click();
	
}

}
