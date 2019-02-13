package excellSheetRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.junit.Test;

public class Read {

	@Test
	public void readText() {
		FileReader f = null;

		StringBuffer b = new StringBuffer();
		try {
			FileReader f1 = new FileReader("book.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader bf = new BufferedReader(f);
		String line = null;
		try {
			line = bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (line != null) {

			System.out.println(line);
			b.append(line).append(System.lineSeparator());
			try {
				line = bf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	@Test
	public void write() {
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("filename.txt"), "utf-8"));
		    writer.write("Something");
		} catch (IOException ex) {
		    // Report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
		
	}









}
