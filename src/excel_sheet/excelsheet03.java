package excel_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet03 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		double y = WorkbookFactory.create(x).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println(y);
		
	}

}
