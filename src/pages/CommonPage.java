package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	CommonPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	public WebDriver driver;
	
}