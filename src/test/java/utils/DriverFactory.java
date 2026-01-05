package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class DriverFactory {

    public WebDriver driver;


    public WebDriver getDriver() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
        Properties prop = new Properties(); //java properties class is used for read .properties files
        prop.load(fis);
        String url = prop.getProperty("QAUrl");
        String browser_properties = prop.getProperty("browser");
        String browser_maven = System.getProperty("browser");
        //result testCondition ? value1 :value2

        String browser = browser_maven!=null ? browser_maven : browser_properties; //ternary operator (short form of if-else):
        //condition ? value_if_true: value_if_false

        if(driver == null) {
            if(browser.equalsIgnoreCase("chrome")) {
                //WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver();

                //Initializes the WebDriver instance

            }
            if(browser.equalsIgnoreCase("firefox")) {

                driver = new FirefoxDriver();
            }

            if(browser.equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
                //driver.manage().window().maximize();
            }
            if(browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get(url);
        }

        return driver;


    }
}
