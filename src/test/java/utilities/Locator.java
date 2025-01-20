package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Locator {
	protected Properties prop;
	
	public void selecturl() throws IOException {
		FileReader fobj=new FileReader("C:\\Users\\muham\\Desktop\\STCLASS\\Assessment2\\Automation2_MuhammedShahil\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(fobj);
	}
	

}
