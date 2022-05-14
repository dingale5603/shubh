package automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Util {
	
	public static void screen() throws IOException {
	File s = ((TakesScreenshot) S1.driver).getScreenshotAs(OutputType.FILE);
	Date a=new Date();
	String currentdate=a.toString();
	currentdate=currentdate.replace(":", " ");
	File d=new File("C:\\Users\\Admin\\Desktop\\new\\"+currentdate+"img.jpg");
    FileHandler.copy(s, d);
	
	}
	public static void takefileinfo() throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\Admin\\Desktop\\External Mock Groups.xlsx");
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
			S1.shubh = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		}
			}
		/*S1.shubh = WorkbookFactory.create(file).getSheet("Sheet1").getRow(83).getCell(1).getStringCellValue();
		S1.deep = WorkbookFactory.create(file).getSheet("Sheet1").getRow(16).getCell(1).getStringCellValue();
		System.out.println(S1.deep);
		System.out.println(S1.shubh);*/
	}
	
}
