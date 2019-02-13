import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ReadAndWrite {

	
	public static void main(String[] args) throws IOException {
		
			
			File file= new File("C:\\Users\\tasmiah\\Desktop\\tas.txt");// new txt file open hobay
			
			file.createNewFile();
			
			/*FileOutputStream fos = new FileOutputStream(file);//how to write i can write both ways
			OutputStreamWriter ous=new OutputStreamWriter(fos);
			BufferedWriter bfw = new BufferedWriter(ous);
			Writer w= new BufferedWriter(bfw);*/
			
			
			Writer w1=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file) ));//this way i will write
			w1.write("my name is tasmiah");
			w1.write("2nd line ");
			w1.write("\n");
			w1.close();
			BufferedReader br = new BufferedReader(new FileReader(file));//read my file
			String s=br.readLine();
			System.out.println(s);
			
	
	}
	
}
