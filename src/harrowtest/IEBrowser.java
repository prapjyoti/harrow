package harrowtest;
/*
"https://www.harrow.gov.uk/"
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowser {
    public static void main(String[] args) {
        String baseUrl ="https://www.harrow.gov.uk/";//variable declare
        WebDriver driver;//obj declare for webdriver
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        driver =new InternetExplorerDriver();//driver obj
        driver.manage().window().maximize();//method for maximize window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);//called the url
        driver.close();
    }
}
