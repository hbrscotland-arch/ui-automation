package stepDefinitions;

import PageObjects.LandingPageActions;
import PageObjects.SigninPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import utils.TestContextSetup;

import java.io.IOException;
import java.util.List;

public class LandingPageStepDef {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    LandingPageActions landingPageActions;
    SigninPageActions signinPageActions;

    public LandingPageStepDef(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.landingPageActions = testContextSetup.pageObjectManager.getLandingPage();
        this.signinPageActions = testContextSetup.pageObjectManager.getSigninPortalPage();
    }

    @Given("I want to launch Url of the application")
    public void i_want_to_launch_url_of_the_application() throws IOException {
        System.out.println("User in Landing Page");
    }

    @Then("the page title should be {string}")
    public void verifyPageTitle(String expectedTitle) throws IOException {
        // Capture actual title from the browser
        String actualTitle = landingPageActions.getTitleLandingPage();

        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
    }

    @Then("User should able to view Menu links:")
    public void verifyMenuLinks(List<String> expectedLinks) throws IOException, InterruptedException {
        landingPageActions.verifyMenuLinks(expectedLinks);
    }

    @Then("User click on Add to cart button for {string}")
    public void user_click_on_add_to_cart_button_for(String item) throws InterruptedException {
        landingPageActions.verifyaddtocartbtn(item);
    }

    @When("user selects dropdown from {string}")
    public void user_selects_dropdown_from(String drpdwn) throws InterruptedException {
        landingPageActions.verifydropdwnvalues(drpdwn);
    }
}
