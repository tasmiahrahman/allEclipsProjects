package com.ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Write {
 
	@Test
	public void write() throws Exception {
		
		File f= new File("C:\\Users\\tasmiah\\Desktop\\ref.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet=	wb.getSheetAt(0);
		sheet.getRow(0).createCell(2).setCellValue("pass");
		FileOutputStream fo= new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		
		
	 
	 
	 
 }
}
