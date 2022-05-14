package automation;
//to  read excel random data and send to facebook page
//import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
/*	
      //beacuse this allready taken in Exceldata1 class thats why here comment
 
	    public String readstrdata(int row,int cell ) throws EncryptedDocumentException, IOException {
		 File file=new File("C:\\Users\\Admin\\Desktop\\myexcel1.xlsx");
		Sheet name = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String student = name.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(student);
		
		return student;
	}
	*/
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", Config.path);
		    WebDriver d=new ChromeDriver();
		    d.navigate().to(Config.url);
		
			Exceldata1 bo=new Exceldata1();
			String strname = bo.readstrdata(0, 0);
			WebElement first = d.findElement(By.xpath("//input[@name='firstname']"));
			first.sendKeys(strname);
			String lastname = bo.readstrdata(0, 1);
		
			WebElement last= d.findElement(By.xpath("//input[@name='lastname']"));
			last.sendKeys(lastname);
		
	}
}
