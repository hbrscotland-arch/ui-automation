package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageActions {

    public WebDriver driver;
     public CartPageActions(WebDriver driver){this.driver = driver;}

     By Removebtn = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
     By FirstNametxtBox = By.xpath("//input[@id='firstName']");
     By LastNametxtBox = By.xpath("//input[@id='last-name']");
     By PostCodetxtBox = By.xpath("//input[@id='postal-code']");
     By Continuebtn = By.xpath("//button[@id='continue']");
     By Finishbtn = By.xpath("//button[@id='finish']");



}
