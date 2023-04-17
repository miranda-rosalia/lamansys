package gmailTest.page;

import BaseTest.BaseChromeTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends BaseChromeTest {

    By userProfileIconLocator = By.className("gb_e.gb_1a.gb_s");

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        if (!driver.getTitle().contains("Recibidos - ")) {
            throw new IllegalStateException("This is not Home Page of logged in user," +
                    " current page is: " + driver.getCurrentUrl());
        }
        Assert.assertTrue(driver.findElement(userProfileIconLocator).isDisplayed());
   }

    public HomePage manageProfile() {
        return new HomePage(driver);
    }
}
