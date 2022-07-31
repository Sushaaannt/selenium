package excel_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet01 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		Workbook y = WorkbookFactory.create(x);
		
		Sheet z = y.getSheet("Sheet1");
		
		Row w = z.getRow(0);
		
		Cell q = w.getCell(0);
		
		String r = q.getStringCellValue();
		
		System.out.println(r);
	}

}
