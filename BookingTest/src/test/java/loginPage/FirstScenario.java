package loginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import login.Login;
import resources.Base;

public class FirstScenario extends Base{

	@Test
	public void launchBrowser() throws Exception {
		driver = InitializeBrowser();
		driver.get("https://www.booking.com/");
		
		Login obj = new Login(driver);
		obj.clickSignIn().click();
		obj.enterUsername().sendKeys("hostkapil@yopmail.com");
		obj.clickContinueWithemail().click();
		obj.enterPassword().sendKeys("Password@10");
		obj.clickFinalSignInn().click();
		//obj.pressAndHold();
		//obj.closePopupbutton().click();
		
		Base objB = new Base();
		objB.screenShot(driver, "C:\\Desktop\\temp\\test.png") ;
	}

}
