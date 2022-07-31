package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex16 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
		
		Sheet sh = WorkbookFactory.create(x).getSheet("Sheet3");
		
		int LastRowIndex = sh.getLastRowNum();
		
		//print all data in excel
		
		for(int i=0; i<=LastRowIndex ;i++ ) {
			int s1 =sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=s1 ;j++)
			{
				Cell s3 = sh.getRow(i).getCell(j);
				CellType s4 = s3.getCellType();
				
	
				if(s4==CellType.STRING) {
					String value=s3.getStringCellValue();
					System.out.print(value+" ");
				}
				else if (s4==CellType.NUMERIC) {
					double value=s3.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if (s4==CellType.BOOLEAN) {
					boolean value = s3.getBooleanCellValue();
					System.out.print(value+" ");
				}

			}
			System.out.println();
			
		}
		
		
	}
	

}
