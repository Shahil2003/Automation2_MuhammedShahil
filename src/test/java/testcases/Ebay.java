package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class Ebay extends TestBase{
	HomePage home;
	
	@BeforeClass
	public void config() {
		home=new HomePage(driver);
	}
	
	@Test
	public void testcase() {
		home.searchProduct();
		home.selectCatogories();
		home.clickSearchButton();
	}
}
