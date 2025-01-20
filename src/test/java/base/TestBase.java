package base;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import utilities.Locator;



public class TestBase extends Locator{
	
	protected WebDriver driver;
	protected Properties prop;
	
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
	    driver.get("http://www.fb.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
