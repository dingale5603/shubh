package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import testcases_login.Tc1;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class Util {
	
	
	public String excel(int row, int cell) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Users\\Admin\\Desktop\\myexcel1.xlsx");
		Sheet src = WorkbookFactory.create(file).getSheet("Sheet1");
		String all = src.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(all);
		return all;
		}
	public void screen() throws IOException {
		File src= ((TakesScreenshot)Tc1.driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String str = d.toString();
		String date = str.replace(":", " ");
		File dest=new File("C:\\Users\\Admin\\Desktop\\new\\"+date+"img.jpg");
		FileHandler.copy(src, dest);
	}

}