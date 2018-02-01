package pages.android.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageSearch/* extends CommonAndroidPage*/{

	//advantages_ok
	@AndroidFindBy(id = "com.lamoda.lite:id/advantages_ok")
	public MobileElement skipOk;
	
	public static final String SKIP_OK_ID= "com.lamoda.lite:id/advantages_ok";
	
	//ask me late
	@AndroidFindBy(id = "com.lamoda.lite:id/image_search_later")
	public MobileElement askLater;
	
	public static final String ASK_LATER_ID =  "com.lamoda.lite:id/image_search_later";
	//xpath kids things
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[@index='2']")
	public MobileElement kids;
	
	public static final String KIDS_XPATH ="//android.widget.LinearLayout[@index='2']";
	
	protected AppiumDriver driver;
	public PageSearch(AppiumDriver driver) {
		//super(driver);
		this.driver=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// TODO Auto-generated constructor stub
	}

	public void searchKidsThings() {
		
		//skipOk.click();
		//askLater.click();
		//kids.click();
        
    	MobileElement el1 = (MobileElement) driver.findElementById(SKIP_OK_ID);
	    el1.click();		        
        
    	MobileElement el2 = (MobileElement) driver.findElementById(ASK_LATER_ID);
        //System.out.println(el2.getText());
        el2.click();
        //MobileElement el3 = (MobileElement) driver.findElementById("com.lamoda.lite:id/toolbar_search");
        //el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath(KIDS_XPATH);
        //findElementById("com.lamoda.lite:id/toolbar_search");
        el4.click();
        /*
        MobileElement el5 = (MobileElement) driver.findElementByClassName("android.webkit.WebView");//.findElementById("com.lamoda.lite:id/banner_wrapper_view");
        System.out.println(el5.getText());
        */
		
	}

}
