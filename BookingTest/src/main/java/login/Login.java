package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public WebDriver driver;
	By signin = By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[6]/a/span");
	By username= By.xpath("//input[@name = 'username']");
	By continueWithemail = By.xpath("//span[contains(text(), 'Continue with email')]");
	By password = By.xpath("//input[@name = 'password']");
	By clickFinalSignIn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button/span");
	By pressAndHoldButton = By.xpath("/html/body/div/div/div[2]/div[2]/p");
	By closeButton = By.xpath("//*[@class = 'modal-mask-closeBtn']");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement clickSignIn() {
		return driver.findElement(signin);
	}
	
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	
	public WebElement clickContinueWithemail() {
		return driver.findElement(continueWithemail);
	}
	
	public WebElement enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name = 'password']")));
		return driver.findElement(password);
	}
	
	public WebElement clickFinalSignInn() {
		return driver.findElement(clickFinalSignIn);
	}
	public void pressAndHold() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(pressAndHoldButton));
		
		Actions actions = new Actions(driver); 
		WebElement holdbutton = driver.findElement(pressAndHoldButton);
		actions.moveToElement(holdbutton);
		actions.clickAndHold().perform(); 		
	}
	
	public WebElement closePopupbutton() {
		return driver.findElement(closeButton);
	}
	

}
