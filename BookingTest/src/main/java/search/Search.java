package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Search {
	public WebDriver driver;
	By searchField = By.xpath("//input[@id = 'ss']");
	By clickSearch = By.xpath("//button[@type = 'submit' and @class = 'sb-searchbox__button ']");
	

	public Search(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement enterSearchText() {
		 
		return driver.findElement(searchField);
		
	}
	public WebElement clickSearch() {
		return driver.findElement(clickSearch);
	}
	
	public void verifyAssertion() {
		// test
	}
	
	

}
