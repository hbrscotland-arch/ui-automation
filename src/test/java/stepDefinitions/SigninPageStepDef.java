package stepDefinitions;

import PageObjects.SigninPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

public class SigninPageStepDef {

    public WebDriver driver;
    TestContextSetup testContextSetup;
    SigninPageActions signinPageActions;


    public SigninPageStepDef(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.signinPageActions = testContextSetup.pageObjectManager.getSigninPortalPage();
    }

    @When("User enters {string} in username textbox field")
    public void user_enters_in_username_textbox_field(String Uname) throws InterruptedException {
        signinPageActions.userNameffield(Uname);
        Thread.sleep(1000);
    }

    @Then("User enters {string} in password textbox field")
    public void user_enters_in_password_textbox_field(String pwd) throws InterruptedException {
        signinPageActions.passwordfield(pwd);
        Thread.sleep(1000);
    }

    @And("user clicks on Sign in Button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        signinPageActions.login();
        Thread.sleep(1000);
    }





}
