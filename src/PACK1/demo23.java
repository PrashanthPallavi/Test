package PACK1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo23 {
	
	public static void main(String[] args) throws Throwable
	{
		FileInputStream f1 = new FileInputStream("./Excel/data.xlsx"); 
		Workbook book = WorkbookFactory.create(f1);    
		
	  book.getSheet("Sheet1").createRow(3).createCell(3).setCellValue("Prashanth"); // it will create space for specified location if not will get null pointer exception 
	  FileOutputStream f2= new FileOutputStream("./Excel/data.xlsx");
	  book.write(f2);
	
	}

}


