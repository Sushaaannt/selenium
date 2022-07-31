package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet04 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		boolean y = WorkbookFactory.create(x).getSheet("Sheet1").getRow(3).getCell(3).getBooleanCellValue();	
				
		System.out.println(y);		
				
							
	}

}
