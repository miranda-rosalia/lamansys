package gmailTest.page;

import BaseTest.BaseChromeTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class HomePage extends BaseChromeTest {
    private Logger logger = Logger.getLogger("Running GmailTest");;
    By userProfileIconLocator = By.xpath("//*[@class=\"gb_e gb_3a gb_v\"]");
     public HomePage(WebDriver driver) {
        try{
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void validateProfile(){
        try{
            logger.info("validate profile. ");
        //    WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(3))
          //          .until(driver -> driver.findElement(userProfileIconLocator));
            Assert.assertTrue(driver.findElement(userProfileIconLocator).isDisplayed());
        }catch (Exception e){
            logger.info(e.toString());

        }

   }

    public HomePage manageProfile() {
        return new HomePage(driver);
    }
}
