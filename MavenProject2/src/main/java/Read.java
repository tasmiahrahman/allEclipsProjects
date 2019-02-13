import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read {

	public static Properties readPropertyFile() throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\tasmiah\\eclipse-workspace\\MavenProject2\\ReadProperty.properties");
		Properties prop=new Properties();
		prop.load(file);
		
	return prop;	
	}
}
