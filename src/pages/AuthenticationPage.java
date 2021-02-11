package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;

public class AuthenticationPage extends PredefinedActions{
	
	public void enterEmailAddress(String emailId) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")))
				.sendKeys(emailId);
		PredefinedActions.scrollVertical();
		System.out.println("Enter email address for the create user name");
	}
	
	public CreateAccountPage clickOnCreateAccount() {
		WebDriverWait wait = new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("SubmitCreate"))).click();
		WebElement element = driver.findElement((By.xpath("//button[@id='SubmitCreate']")));
		element.click();
		System.out.println("Clicked on the submit button to fill the other details");
		return new CreateAccountPage();
	}
}
