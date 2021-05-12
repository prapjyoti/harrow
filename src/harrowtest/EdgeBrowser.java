package harrowtest;
/*
"https://www.harrow.gov.uk/"
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl= "https://www.harrow.gov.uk/";////variable declare (url)
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");//property set for edge driver
        WebDriver driver= new EdgeDriver();//obj created
        driver.get(baseUrl);//called the url
        driver.manage().window().maximize();//method for maximize window
        driver.close();//driver close
    }
}
