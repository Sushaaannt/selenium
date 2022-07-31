package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet09 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		
		Sheet y = WorkbookFactory.create(x).getSheet("Sheet2");
		
		int z = y.getRow(0).getLastCellNum()-1;
		
		//print all data in row
		
		for(int i=0; i<=z;i++) 
		{
			String value = y.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(value +" ");
		}
		
	}

}
