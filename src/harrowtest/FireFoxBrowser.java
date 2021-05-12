package harrowtest;
/*
"https://www.harrow.gov.uk/"
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";//variable decare
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");//set property for firefox and copy path
        WebDriver driver = new FirefoxDriver();//obj created
        driver.manage().window().maximize();//method for maximize window
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();


    }
}
