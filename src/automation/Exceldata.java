package automation;
//to read data from excel in sequence
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata {
	static WebDriver driver;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",Config.path);
		driver=new ChromeDriver();
		driver.navigate().to(Config.url);
		
		File file=new File("C:\\Users\\Admin\\Desktop\\myexcel1.xlsx");
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<=5;i++) {
		
			String student_name = s.getRow(i).getCell(0).getStringCellValue();
			WebElement num = driver.findElement(By.xpath("//input[@name='firstname']"));
			num.sendKeys(student_name);
			Thread.sleep(1000);
			String lastname = s.getRow(i).getCell(1).getStringCellValue();
			WebElement num1 = driver.findElement(By.xpath("//input[@name='lastname']"));
			num1.sendKeys(lastname);
			Thread.sleep(1000);

		    double val = s.getRow(i).getCell(2).getNumericCellValue();
 		long a=(long) val;
 	 WebElement num2 = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
 	 String p=Long.toString(a);
 		num2.sendKeys(p);
 		Thread.sleep(1000); 		
 		
			System.out.print(" "+student_name+" "+a);

		System.out.println();
		num.clear();
		num1.clear();
		num2.clear();
			}

	}

	

}
