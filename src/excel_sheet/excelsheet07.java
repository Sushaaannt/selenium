package excel_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet07 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		 short z = WorkbookFactory.create(x).getSheet("Sheet2").getRow(0).getLastCellNum();
		 
		 //if we have to get size of colmn then we should take it from starts from 1 index
			
		System.out.println(z);
		
		
		
		
		
		
	}

}
