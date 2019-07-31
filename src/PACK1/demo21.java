package PACK1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo21 {
	
	public static void main(String[] args) throws Throwable
	{
		FileInputStream f1 = new FileInputStream("./Excel/data.xlsx"); // fileinputstream read the data from excel file
		
		Workbook book = WorkbookFactory.create(f1);    // it will create work space for input file 
	    String data = book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();     // row & column starts index from 0 in apache
	
	   System.out.println(data);
	}

}
