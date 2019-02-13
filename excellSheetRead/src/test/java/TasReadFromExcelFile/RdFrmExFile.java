package TasReadFromExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class RdFrmExFile {

	
	
	
	 
	@Test
	public void m1() throws Exception{
	File file= new File("C:\\Users\\tasmiah\\Desktop\\ref.xlsx");

	FileInputStream fis = new FileInputStream("file");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	String data0=sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data0);
	wb.close();
	 
}
}