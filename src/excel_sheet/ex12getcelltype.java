package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex12getcelltype {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
     FileInputStream x = new FileInputStream("D:\\Selenium tool\\New01.xlsx");
    
    Sheet y = WorkbookFactory.create(x).getSheet("Sheet3");
    
    CellType z = y.getRow(0).getCell(4).getCellType();
    
	System.out.println(z);	
		
	}

}
