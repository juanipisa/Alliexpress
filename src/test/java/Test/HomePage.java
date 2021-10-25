package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import Config.Setup;

public class HomePage extends BasePage {
	
	private static final String HOME_PAGE_URL = "https://www.aliexpress.com";
	
	public void validatePage() {
		this.logo();
		this.searchButton();
	}

	public void goToHomePage(){
        Setup.driver.get(HOME_PAGE_URL);
    }
	
	public WebElement couponAdCloseButton() {
		return Setup.driver.findElement(By.className("btn-close"));
	}
	
	public void logo() {
		Setup.driver.findElements(By.className("logo-base"));
	}
	
	public void searchBarSendKeys(String product) {
		Setup.driver.findElement(By.id("search-key")).sendKeys(product);
	}
	
	public WebElement searchButton() {
		return Setup.driver.findElement(By.className("search-button"));
	}

	public WebElement nextResultPageBar() {
		return Setup.driver.findElement(By.xpath("//button[(@class='next-btn next-medium next-btn-normal next-pagination-item next-next')]"));
	}
	
	public WebElement selectProduct(String productNumber) throws InterruptedException {
		try {
			Thread.sleep(1000); 
			return Setup.driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[2]/div/div[2]/a["+productNumber+"]"));

		}

		catch(NoSuchElementException  exceptionClick) {
			Thread.sleep(1000); 
			return Setup.driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/div[2]/div/div[2]/div["+productNumber+"]/a"));
		}
		
	}
	
}
