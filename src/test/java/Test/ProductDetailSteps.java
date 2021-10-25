package Test;

import io.cucumber.java.en.Then;

import org.testng.Assert;

public class ProductDetailSteps {

    private ProductDetail productDetail;

    public ProductDetailSteps() {
        this.productDetail = new ProductDetail();
    }

    @Then("^the ad has at least 1 item to be bought$")
    public void validateAvaivableProduct() {
    	String maxAmount = this.productDetail.productAvailable().getAttribute("aria-valuemax");
    	Assert.assertNotEquals(maxAmount, 0);
    }   
    
}