package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public LandingPageActions landingPageActions;
    public SigninPageActions signinPageActions;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){this.driver = driver;}

    public LandingPageActions getLandingPage(){
        landingPageActions =new LandingPageActions(driver);
        return landingPageActions;
    }

    public SigninPageActions getSigninPortalPage(){
      signinPageActions = new SigninPageActions(driver);
      return signinPageActions;
    }
}
