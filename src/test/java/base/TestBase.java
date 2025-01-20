package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;



public class TestBase {
	
	protected WebDriver driver;
	protected Properties prop;
	public void selecturl() throws IOException {
		FileReader fobj=new FileReader("C:\\Users\\muham\\Desktop\\STCLASS\\Assessment2\\Automation2_MuhammedShahil\\src\\test\\resources\\config.properties");
	    prop=new Properties();
		prop.load(fobj);
	}
	
	
	public void selectBrowser() throws IOException {
		if(prop.getProperty("browser").equals("chrome")) {
			driver =new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("edge")) {
		    driver = new EdgeDriver();
		}

		else if(prop.getProperty("browser").equals("firefox")) {
			driver =new FirefoxDriver();
		}
	}
	
	@BeforeTest
	public void setUp() throws IOException {
	    selecturl();
	    selectBrowser();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
