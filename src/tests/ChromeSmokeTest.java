package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.SearchPage;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ChromeSmokeTest {
	private WebDriver driver;
	 
    
	@BeforeMethod
	public void setUp() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");
		options.addArguments("--enable-precise-memory-info");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("--enable-automation");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		options.addArguments("disable-extensions");
        System.setProperty("webdriver.chrome.driver", "D:\\work\\testing\\auto.ru\\chromedriver.exe");
    	driver = new ChromeDriver(options);
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
