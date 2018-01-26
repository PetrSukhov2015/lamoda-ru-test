package pages;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonPage{

	@FindBy(css="body > div.page > div.logo-line-wrapper.width-wrapper > div.gender-menu.menu_und > a.link.menu_und__link.menu_und__link_active")
	WebElement woman; 
	@FindBy(css="body > div.page > div.header.js-header > div > div > div > div")
	WebElement region;
	@FindBy(css="body > div.modal.modal_geo.modal_visible > div > div > div > div.modal__layout > form > div.geo__buttons > button > span")
	WebElement submitRegion;
	@FindBy(css="#menu-wrapper > div > div:nth-child(2) > div:nth-child(2) > a")
	WebElement clothes;
	@FindBy(css="body > div.sub-popup-aug17 > div.sub-popup-aug17_head > div")
	WebElement clothPopUp;
	@FindBy(css="body > div.page > div:nth-child(7) > div > div.table__right-column > div.product-catalog-main > div > div.multi-wrapper > div > div > span")
	WebElement searchNumResult;
	
	public SearchPage(WebDriver driver) {
		super(driver);
		
		
		
	}

	public void searchWomanClothes() {
		//select woman 
		driver.findElement(By.xpath("//*[@id=\"menu-wrapper\"]/div/div[2]/div[2]/a")).click();
		woman.click(); 
		//select local region
		region.click();
		submitRegion.click();
		//close some pop up
		//clothPopUp.click();
		//select women clothes
		clothes.click();
		clothes.click();
		
	}

	public void checkSearchResul() {
		
		//System.out.println(searchNumResult.getText());
		//check that result is not 0
		assertTrue(Integer.parseInt(searchNumResult.getText().split(" ")[0]) > 0);
	}

}
