package automation;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//main method of that class is in Runner.java

public class Exceldata1 {
	
	public String readstrdata(int row,int cell ) throws EncryptedDocumentException, IOException {
		 File file=new File("C:\\Users\\Admin\\Desktop\\myexcel1.xlsx");
		Sheet name = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String student = name.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(student);
		
		return student;
		
	}
	

}
