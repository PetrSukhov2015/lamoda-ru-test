package tests;
//package AutoRuTest.AutoRuTestChild;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class LamodaTestSearch {
	
	
		 private AppiumDriver<WebElement> driver;
		 
		    @BeforeMethod
			public void setUp() throws Exception {
		        //File classpathRoot = new File(System.getProperty("user.dir"));
		        //File appDir = new File(classpathRoot, "../../");
		        File app = new File( "D:\\work\\testing\\lamoda\\com.lamoda.lite-1.apk");
		        DesiredCapabilities capabilities = new DesiredCapabilities();
		        capabilities.setCapability("deviceName","LGE Nexus 4");
		        capabilities.setCapability("platformVersion", "4.4");
		        //capabilities.setCapability("app", app.getAbsolutePath());
		        capabilities.setCapability("appPackage", "com.lamoda.lite");
		        
		        //capabilities.setCapability("unicodeKeyboard", "true");                                     
		        //capabilities.setCapability("resetKeyboard", "true");
		        capabilities.setCapability("appActivity", "com.lamoda.lite.businesslayer.activities.LauncherActivity");
		        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        //System.out.println("i am here");
		    }
		 
		    @AfterMethod
			public void tearDown() throws Exception {
		        driver.quit();
		    }
		 
		    @Test
		    public void search(){
		    	
		    	MobileElement el1 = (MobileElement) driver.findElementById("com.lamoda.lite:id/advantages_ok");
			    el1.click();		        
		        
		    	MobileElement el2 = (MobileElement) driver.findElementById("com.lamoda.lite:id/image_search_later");
		        //System.out.println(el2.getText());
		        el2.click();
		        MobileElement el3 = (MobileElement) driver.findElementById("com.lamoda.lite:id/toolbar_search");
		        el3.click();
		        //System.out.println(el3.getText());
		        //*/
		    	//AndroidView ap = new AndroidView(driver);
		    	//ap.smokeTestReasrch();
		    	
		    }
	
}
