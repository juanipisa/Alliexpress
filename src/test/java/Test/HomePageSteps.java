package Test;

import io.cucumber.java.en.When;


import org.openqa.selenium.JavascriptExecutor;

import Config.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^I go to the webpage alliexpress$")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
        this.homePage.couponAdCloseButton().click();
        this.homePage.validatePage();
    }

    @When("^I search for (.*) in the search Bar$")
    public void aUserSearchAProduct(String product) {
    	this.homePage.searchBarSendKeys(product);
    	this.homePage.searchButton().click();
    }

    @And("I click on the next result page$")
    public void aUserClickOnResultPage() throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) Setup.driver;
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	
        this.homePage.nextResultPageBar().click();;
    }
   
    @And("^I click on the (.*) ad of the product$")
    public void aUserClickOnProduct(String numberOfProduct) throws InterruptedException {
    	this.homePage.selectProduct(numberOfProduct).click();
    	
    	String originalWindow = Setup.driver.getWindowHandle();
    	
		for (String windowHandle : Setup.driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        Setup.driver.switchTo().window(windowHandle);
		        break;
		    }
		}
    }   
    
}