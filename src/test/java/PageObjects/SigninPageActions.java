package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPageActions {

    public WebDriver driver;

    public SigninPageActions(WebDriver driver) {
        this.driver = driver;
    }

    By UsernametxtBox = By.xpath("//input[@id=\"user-name\"]");
    By PasswordtxtBox = By.xpath("//input[@id=\"password\"]");
    By Loginbtn = By.xpath("//input[@id=\"login-button\"]");

    public void userNameffield(String Uname) {
        driver.findElement(UsernametxtBox).sendKeys(Uname);
    }

    public void passwordfield(String pwdname) {
        driver.findElement(PasswordtxtBox).sendKeys(pwdname);
    }

    public void login() throws InterruptedException {
        driver.findElement(Loginbtn).click();
        //Thread.sleep(2000);

    }
    public WebElement getUsernameField() {
        return driver.findElement(UsernametxtBox);
    }
}