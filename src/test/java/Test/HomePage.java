package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	private static final String HOME_PAGE_URL = "https://www.aliexpress.com";
	
	public void validatePage() {
		this.logo();

	}

	public void goToHomePage(){
        driver.get(HOME_PAGE_URL);
    }
	
	public WebElement couponAdCloseButton() {
		return this.driver.findElement(By.className("btn-close"));
	}
	
	public void logo() {
		this.driver.findElements(By.className("logo-base"));
	}
	
	public void searchBarSendKeys(String product) {
		this.driver.findElement(By.id("search-key")).sendKeys(product);
	}
	
	public WebElement searchButton() {
		return this.driver.findElement(By.className("search-button"));
	}

	public WebElement nextResultPageBar() {
		return this.driver.findElement(By.xpath("//button[(@class='next-btn next-medium next-btn-normal next-pagination-item next-next')]"));
	}
	
	public WebElement selectProduct(String numberOfProduct) {
		return this.driver.findElement(By.xpath("(//div[(@class='_1OUGS')])[" + numberOfProduct + "]"));
	}
	
}
