package PACK1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo22 {
	
	public static void main(String[] args) throws Throwable
	{
		FileInputStream f1 = new FileInputStream("./Excel/data.xlsx"); // fileinputstream read the data from excel file
		
		Workbook book = WorkbookFactory.create(f1);    // it will create work space for input file 
	  book.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Pallavi"); // return the data in workspace
	 
	  FileOutputStream f2= new FileOutputStream("./Excel/data.xlsx");
	 book.write(f2);
	
	}

}


//o/p - will be in excel file as "Pallavi"