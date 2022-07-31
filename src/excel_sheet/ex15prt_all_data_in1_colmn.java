package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex15prt_all_data_in1_colmn {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		Sheet y = WorkbookFactory.create(x).getSheet("Sheet3");
		
		int z = y.getLastRowNum();
		
		for(int i=0; i<=z ; i++) 
		{
			Cell a = y.getRow(i).getCell(0);
			
			CellType b = a.getCellType();
			
			if(b==CellType.STRING) {
				System.out.println(a.getStringCellValue()+" ");
			}
			else if (b==CellType.NUMERIC) {
				System.out.println(a.getNumericCellValue()+" ");
			}
			else if (b==CellType.BOOLEAN) {
				System.out.println(a.getBooleanCellValue()+" ");
			}
		}
		
	}


}
