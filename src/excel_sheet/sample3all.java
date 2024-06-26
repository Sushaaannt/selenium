package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3all {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)       //outer for loop rows
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=lastCellIndex; j++)               //inner for loop cols
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+ " ");
			}
			System.out.println();
		}
	
	}

}
