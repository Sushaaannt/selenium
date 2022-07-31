package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex14prt_all_data_in_row {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		Sheet y = WorkbookFactory.create(x).getSheet("Sheet3");
		
		int z = y.getRow(2).getLastCellNum()-1;
		
		for(int i=0; i<=z ; i++) 
		{
			Cell a = y.getRow(2).getCell(i);
			
			CellType b = a.getCellType();
			
			if(b==CellType.STRING) {
				System.out.print(a.getStringCellValue()+" ");
			}
			else if (b==CellType.NUMERIC) {
				System.out.print(a.getNumericCellValue()+" ");
			}
			else if (b==CellType.BOOLEAN) {
				System.out.print(a.getBooleanCellValue()+" ");
			}
		}
		
	}

}
