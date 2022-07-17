package searchPageAndAssertion;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;
import resources.Base;
import search.Search;

public class SearchPage extends Base{
	
	@Test
	public void searchentry() throws Exception {
		
		driver = InitializeBrowser();
		driver.get("https://www.booking.com/");
		
		Search obj = new Search(driver);
		obj.enterSearchText().sendKeys("Texas");
		obj.clickSearch().click();

	//Check Title assertion
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Booking.com : Hotels in Texas . Book your hotel now!";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Assertion is passed, Script worked well");
		
		Base objB = new Base();
		objB.screenShot(driver, "C:\\Desktop\\temp\\test.png") ;
		
	}

}
