package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LandingPageActions {

    public WebDriver driver;
    WebDriverWait wait;
    By Menubtn = By.xpath("//button[contains(text(),'Open Menu')]");
    By CloseMenubtn = By.xpath("//button[contains(text(),'Close Menu')]");
    By Cartbtn = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");

    public LandingPageActions(WebDriver driver) {
        this.driver = driver;
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitleLandingPage(){

        return driver.getTitle();
    }

    public void verifyMenuLinks(List<String> expectedLinks) throws IOException, InterruptedException {

        driver.findElement(Menubtn).click();
        //Thread.sleep(2000);
        // Locate all anchor tags within the navigation menu
        List<WebElement> actualMenuElements = driver.findElements(By.xpath("//div[@class='bm-menu']/nav/a"));
        List<String> actualLinkTexts = new ArrayList<>();
        for (WebElement element : actualMenuElements) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                actualLinkTexts.add(text);
            }
        }
        // Verify if all expected links are present in the actual list
        Assert.assertTrue(actualLinkTexts.containsAll(expectedLinks));
        //driver.findElement(CloseMenubtn).click();
        //Thread.sleep(3000);
        WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(CloseMenubtn));
        closeBtn.click();
    }

    public void verifyaddtocartbtn(String itemlist) throws InterruptedException {

        List<WebElement> itemList = driver.findElements(By.xpath("//div[@class='inventory_item_name '] "));
        List<String> actualitem = new ArrayList<>();
        for (WebElement element : itemList) {
            String item =element.getText();
            if (itemlist.equals(item)){
                System.out.println("value matched");
                //driver.findElement(Cartbtn).click();
                WebElement ele = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
                if(ele.isDisplayed()){
                    ele.click();
                }
            }
        }
    }

    public void verifydropdwnvalues(String drpdwn ) throws InterruptedException {
        WebElement dropdownElement = driver.findElement(By.xpath("//select[contains(@class,'product_sort_container')]"));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(drpdwn);
        // Thread.sleep(2000);
    }
}