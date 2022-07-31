package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet06 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		int y = WorkbookFactory.create(x).getSheet("Sheet2").getLastRowNum()+1;
		
		//if we have to get size of row then we should take +1 as it starts from 0 index
		 
		System.out.println(y); 
		
		
			
		
	}

}
