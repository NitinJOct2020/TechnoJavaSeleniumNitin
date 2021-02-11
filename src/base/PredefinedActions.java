package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class PredefinedActions {
	protected static WebDriver driver;
	public static void start() {
		System.setProperty(ConstantPath.chromeDriverKey, ConstantPath.chromeDriverPath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Navigate to Application");
	}
	public static WebDriver scrollVertical() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		return driver;
	}
}
