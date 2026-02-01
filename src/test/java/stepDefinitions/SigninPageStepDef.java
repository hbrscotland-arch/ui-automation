package stepDefinitions;

import PageObjects.SigninPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestContextSetup;

import java.io.IOException;
import java.time.Duration;

public class SigninPageStepDef {

    public WebDriver driver;
    TestContextSetup testContextSetup;
    SigninPageActions signinPageActions;
    WebDriverWait wait;

    public SigninPageStepDef(TestContextSetup testContextSetup) throws IOException {
        this.testContextSetup = testContextSetup;
        this.signinPageActions = testContextSetup.pageObjectManager.getSigninPortalPage();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("User enters {string} in username textbox field")
    public void user_enters_in_username_textbox_field(String Uname) throws InterruptedException {
        //signinPageActions.userNameffield(Uname);
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(
         signinPageActions.getUsernameField()));
         signinPageActions.userNameffield(Uname);
    }

    @Then("User enters {string} in password textbox field")
    public void user_enters_in_password_textbox_field(String pwd) throws InterruptedException {
        signinPageActions.passwordfield(pwd);
       // Thread.sleep(1000);
    }

    @And("user clicks on Sign in Button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        signinPageActions.login();
       // Thread.sleep(1000);
    }
}
