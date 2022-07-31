package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet08 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		String y = WorkbookFactory.create(x).getSheet("Sheet2").getRow(2).getCell(2).getStringCellValue();
		
		//converting int value to string ==>112 to '112 (apostrophe)
		
		System.out.println(y);
		
	}

}
