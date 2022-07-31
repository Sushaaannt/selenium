package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex13get_data_of_celltype {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		Sheet y = WorkbookFactory.create(x).getSheet("Sheet3");
		
		 Cell z = y.getRow(2).getCell(3);
		 
		CellType a = z.getCellType();
		
		if(a==CellType.STRING)
		{
			String value = z.getStringCellValue();
			System.out.println(value);
		}
		else if (a==CellType.NUMERIC)
		{
			double value = z.getNumericCellValue();
			System.out.println(value);
		}
		else if (a==CellType.BOOLEAN)
		{
			 boolean value = z.getBooleanCellValue();
			 System.out.println(value);
		}
		System.out.println(a);
	}

}
