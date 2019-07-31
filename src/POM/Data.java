package POM;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {
	
	public static String getdata(String sheet,int row,int column) throws Throwable{
	
	FileInputStream f1= new FileInputStream("./Excel/data.xlsx");
 
	Workbook book = WorkbookFactory.create(f1);    
	
	 String d = book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
	 return d;
} 
	
}
