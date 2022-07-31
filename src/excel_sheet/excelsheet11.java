package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet11 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		Sheet y = WorkbookFactory.create(x).getSheet("Sheet2");
		
		int LastRowIndex = y.getLastRowNum();
		
		//print all data in excel
		
		for(int i=0; i<=LastRowIndex ; i++)
		{
			int lastCellIndex = y.getRow(i).getLastCellNum()-1;
			
			
			for(int j=0; j<=lastCellIndex ;j++) 
			{
				String value = y.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value +" ");
			}
			System.out.println();
		}
			
	}

}
