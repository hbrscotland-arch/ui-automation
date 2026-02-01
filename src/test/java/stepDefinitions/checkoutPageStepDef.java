package stepDefinitions;

import PageObjects.CartPageActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class checkoutPageStepDef {

    TestContextSetup testContextSetup;
    CartPageActions cartPageActions;

    public checkoutPageStepDef(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.cartPageActions = testContextSetup.pageObjectManager.getCartPageActions();
    }

    @Then("User click on cart link icon")
    public void user_click_on_cart_link_icon() throws InterruptedException {
        cartPageActions.cartlink();
    }

    @Then("User clicks on Checkout button")
    public void user_clicks_on_checkout_button() throws InterruptedException {
        cartPageActions.checkoutcart();
    }

    @When("User enters {string} in firstname textbox field")
    public void user_enters_in_firstname_textbox_field(String firstname) throws InterruptedException {
        cartPageActions.firstNamefield(firstname);
        //Thread.sleep(2000);
    }

    @When("User enters {string} in lastname textbox field")
    public void user_enters_in_lastname_textbox_field(String lastname) throws InterruptedException {
       cartPageActions.lastNamefield(lastname);
      // Thread.sleep(2000);
    }

    @When("User enters {string} in postcode textbox field")
    public void user_enters_in_postcode_textbox_field(String postcode) throws InterruptedException {
        cartPageActions.postalcodefield(postcode);
       // Thread.sleep(2000);
    }

    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() throws InterruptedException {
        cartPageActions.Continue();
    }

    @When("User clicks on finish button")
    public void user_clicks_on_finish_button() throws InterruptedException {
        cartPageActions.finish();
    }

    @Then("User verify success message")
    public void user_verify_success_message() throws InterruptedException {
        cartPageActions.verifyMessage("Thank you for your order!");
    }
}
