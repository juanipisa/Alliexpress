package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Config.Setup;

public class ProductDetail extends BasePage {
	
	public void validatePage() {
		this.productNameText();
		this.addToCartButton();
	}
	
	public void productNameText() {
		Setup.driver.findElement(By.xpath("//h1[(@class='product-title-text') and (contains(text(),'iPhone'))]"));
	}
	
	public void addToCartButton() {
		Setup.driver.findElement(By.xpath("//button[(@class='next-btn next-large next-btn-primary buynow') and (contains(text(), 'Comprar'))]"));
		
	}
	
	public WebElement productAvailable() {
		return Setup.driver.findElement(By.xpath("//span[(@class='next-input next-medium next-input-group-auto-width')]"));
	}
		
}
	