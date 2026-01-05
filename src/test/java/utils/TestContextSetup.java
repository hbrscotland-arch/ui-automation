package utils;

import PageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public DriverFactory driverFactory;
    public GenericUtils genericUtils;

    public TestContextSetup() throws IOException {

        driverFactory = new DriverFactory();
        pageObjectManager = new PageObjectManager(driverFactory.getDriver());
        genericUtils = new GenericUtils(driverFactory.getDriver());
    }

}
