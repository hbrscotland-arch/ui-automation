package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public LandingPageActions landingPageActions;
    public SigninPageActions signinPageActions;
    public CartPageActions cartPageActions;
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

    public CartPageActions getCartPageActions(){
         cartPageActions = new CartPageActions(driver);
        return cartPageActions;
    }
}
