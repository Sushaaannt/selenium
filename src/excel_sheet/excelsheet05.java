package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excelsheet05 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		String a = WorkbookFactory.create(x).getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		System.out.println(a);
		
		double b = WorkbookFactory.create(x).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println(b);
		
		boolean c = WorkbookFactory.create(x).getSheet("Sheet1").getRow(3).getCell(5).getBooleanCellValue();
		
		System.out.println(c);
	}

}
