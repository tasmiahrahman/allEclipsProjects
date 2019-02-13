package excellSheetRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import com.google.common.collect.Table.Cell;

public class MyRead {
	@Test
	public void myRead() throws IOException {
	BufferedReader fr= new BufferedReader(new FileReader("book.txt"));	
		String line;
		while((line = fr.readLine())!=null) {
			System.out.println(line);
			
		}
	}

public void myWrite() {
	BufferedWriter wr=null;
	try {wr=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("knfil.txt")));

		//Writer.write("");
	
	}
	catch(Exception ex) {
		
	}
	finally{
		
		
	}
}
public class ReadExcel { 
	                       
	 File fis = new File("C:\\Users\\tasmiah\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
	 
	/* XSSFWorkbook workbook = new XSSFWorkbook(fis);
	 XSSFSheet sheet = workbook.getSheetAt(0);
	                        
	                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	 XSSFRow row = sheet.getRow(0);
	 XSSFCell cell = row.getCell(0);
	                       private void syso() {
				*/			// TODO Auto-generated method stub

						}
	// System.out.println(sheet.getRow(0).getCell(0));
	 //String cellval = cell.getStringCellValue();
	 //System.out.println(cellval);
	 
	 
	}








