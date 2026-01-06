package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageActions {

    public WebDriver driver;
     public CartPageActions(WebDriver driver){this.driver = driver;}

     By Cartlink = By.xpath("//a[@class='shopping_cart_link']");
     By Checkoutbtn = By.xpath("//button[@id='checkout']");
     By FirstNametxtBox = By.xpath("//input[@id='first-name']");
     By LastNametxtBox = By.xpath("//input[@id='last-name']");
     By PostCodetxtBox = By.xpath("//input[@id='postal-code']");
     By Continuebtn = By.xpath("//input[@id='continue']");
     By Finishbtn = By.xpath("//button[@id='finish']");
     By msgTxt = By.xpath("//h2[contains(text(),'Thank you for your order!')]");


     public void cartlink() throws InterruptedException {
         driver.findElement(Cartlink).click();
         Thread.sleep(2000);
     }

     public void checkoutcart() throws InterruptedException {
      driver.findElement(Checkoutbtn).click();
      Thread.sleep(2000);

     }

 public void firstNamefield(String fname) { driver.findElement(FirstNametxtBox).sendKeys(fname);}

 public void lastNamefield(String lname) { driver.findElement(LastNametxtBox).sendKeys(lname);}

 public void postalcodefield(String pcode)
 {
     driver.findElement(PostCodetxtBox).sendKeys(pcode);
 }

 public void Continue() throws InterruptedException {
      driver.findElement(Continuebtn).click();
      Thread.sleep(2000);
 }

 public void finish() throws InterruptedException {
       driver.findElement(Finishbtn).click();
       Thread.sleep(2000);
 }

public void verifyMessage(String ExpectedMsg) throws InterruptedException {
      String actualmsg = driver.findElement(msgTxt).getText();
      Assert.assertEquals(actualmsg,ExpectedMsg);
      Thread.sleep(2000);

}

}
