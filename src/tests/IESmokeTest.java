package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.SearchPage;

public class IESmokeTest {
private WebDriver driver;
	 
    
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.ie.driver", "D:\\work\\testing\\lamoda\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.get("https://www.lamoda.ru");
    	

    }
 
    
	@AfterMethod
	public void tearDown() throws Exception {
        driver.quit();
    }
 
    @Test
    public void search(){

        SearchPage page = new SearchPage(driver);
        page.searchWomanClothes();
        page.checkSearchResul();
    }
}
