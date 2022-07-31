package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample2colmn {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
//		for(int i=0; i<=3; i++) 
//		{
//			String value = sh.getRow(i).getCell(0).getStringCellValue();
//			System.out.println(value);
//		}
		
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++) 
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
			
	}

}
