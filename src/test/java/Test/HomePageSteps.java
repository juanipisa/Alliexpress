package Test;

import io.cucumber.java.en.When;
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
    public void aUserNavigatesToSignUp(String product) {
    	this.homePage.searchBarSendKeys(product);
    	this.homePage.searchButton().click();
    }

    @And("I click on the next result page$")
    public void aUserClickOnResultPage() {
    	
        this.homePage.nextResultPageBar().click();;
    }
    
    @And("^I click on the (.*) ad of the product$")
    public void aUserClickOnProduct(String numberOfProduct) {
        this.homePage.selectProduct(numberOfProduct).click();;
    }   
    
}