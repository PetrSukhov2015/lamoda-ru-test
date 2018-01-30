package pages.android.app;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageSearch extends CommonAndroidPage{

	//advantages_ok
	@AndroidFindBy(id = "com.lamoda.lite:id/advantages_ok")
	public MobileElement skipOk;
	
	//ask me late
	@AndroidFindBy(id = "com.lamoda.lite:id/image_search_later")
	public MobileElement askLater;
	
	//xpath kids things
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[@index='2']")
	public MobileElement kids;
	
	private AppiumDriver driver;

	public PageSearch(AppiumDriver driver) {
		super(driver);
		//this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public void searchKidsThings() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		skipOk.click();
		askLater.click();
		kids.click();
        /*
    	MobileElement el1 = (MobileElement) driver.findElementById("com.lamoda.lite:id/advantages_ok");
	    el1.click();		        
        
    	MobileElement el2 = (MobileElement) driver.findElementById("com.lamoda.lite:id/image_search_later");
        //System.out.println(el2.getText());
        el2.click();
        //MobileElement el3 = (MobileElement) driver.findElementById("com.lamoda.lite:id/toolbar_search");
        //el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@index='2']");
        //findElementById("com.lamoda.lite:id/toolbar_search");
        el4.click();
        
        MobileElement el5 = (MobileElement) driver.findElementByClassName("android.webkit.WebView");//.findElementById("com.lamoda.lite:id/banner_wrapper_view");
        System.out.println(el5.getText());
        */
		
	}

}
