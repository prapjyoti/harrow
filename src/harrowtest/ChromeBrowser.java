package harrowtest;
/*
"https://www.harrow.gov.uk/"
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl= "https://www.harrow.gov.uk/";//variable declare (url)
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//property set for chrome
        WebDriver driver=new ChromeDriver();//obj created
        driver.manage().window().maximize();// method ofr maximize window
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//time out
        driver.get(baseUrl);
        //fetch the title
        String title=driver.getTitle();
        System.out.println(title);
        driver.close();//command for close the browser
    }
}
