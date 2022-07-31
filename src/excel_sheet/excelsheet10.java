package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet10 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		Sheet y = WorkbookFactory.create(x).getSheet("Sheet2");
		
		int z = y.getLastRowNum();
		
		//print all data in colmn
		
		for(int i=0;i<=z;i++) 
		{
			String a = y.getRow(i).getCell(0).getStringCellValue();
			System.out.println(a);
		}
			
	}

}
