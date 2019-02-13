package com.ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Ignore;
import org.junit.Test;

//Read from Excel
public class ReadExcel {

	@Test
	public void m1() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\tasmiah\\Desktop\\ref.xlsx");//if i already have a excel sheet then this 
																							//i need file class. if no excel sheet
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		wb.close();
		
		// akta note add korlum
		System.out.println("last try"); 
		
	}
	
	@Test@Ignore//Practice
	public void howManyRows() throws Exception {
		
		File f=new File("");//not working if i use it.
		FileInputStream fis = new FileInputStream("C:\\Users\\tasmiah\\Desktop\\ref.xlsx");//if i already have a excel sheet then this 
																							//or what i need file class. if no excel sheet
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0+" // String data0=sheet.getRow(0).getCell(0).getStringCellValue();"+" Zawata show korbay ");
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount+" //int rowCount=sheet.getLastRowNum();  show korbay 3");
		System.out.println(data0+" //data0");
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue()+" //sheet.getRow(1).getCell(1).getStringCellValue() ");
		for(int s=0;s<rowCount;s++) {
		String data=sheet.getRow(s).getCell(0).getStringCellValue();
		System.out.println(data+"  //String data=sheet.getRow(s).getCell(0).getStringCellValue();");
		}
			
			
			
		wb.close();
		
		
	}
}
