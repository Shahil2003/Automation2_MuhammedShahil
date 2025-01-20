package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchProduct() {
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		searchbox.sendKeys("Apple Watches");
	}
	
	public void selectCatogories() {
		WebElement catogories = driver.findElement(By.xpath("//select[@name='_sacat']"));
		Select selectCatogory=new Select(catogories);
		selectCatogory.selectByContainsVisibleText("Consumer Electronics");
	}
	
	public void clickSearchButton() {
		WebElement searchbutton = driver.findElement(By.xpath("//button[@id='gh-search-btn']"));
		searchbutton.click();
	}
	

}
