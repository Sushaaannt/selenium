package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1rows {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
//		for(int i=0; i<=3; i++)
//		{
//			String value = sh.getRow(0).getCell(i).getStringCellValue();
//			System.out.print(value+" ");
//		}
			
			int lastCellIndex = sh.getRow(0).getLastCellNum()-1;	
			for(int i=0; i<=lastCellIndex; i++)
			{
				String value = sh.getRow(0).getCell(i).getStringCellValue();
				System.out.print(value+" ");
			}
					
		}
}
