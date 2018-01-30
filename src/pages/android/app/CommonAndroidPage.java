package pages.android.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CommonAndroidPage {

	private AppiumDriver driver;

	public CommonAndroidPage(AppiumDriver driver) {
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
		this.driver=(AppiumDriver)driver;
		/*
		 * RemoteTestNG] detected TestNG version 6.13.1
џэт 30, 2018 10:34:14 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
FAILED: search
java.lang.NoClassDefFoundError: net/sf/cglib/proxy/MethodInterceptor
		 */
	}
}
