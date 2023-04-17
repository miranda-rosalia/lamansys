package gmailTest.page;

import BaseTest.BaseChromeTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseChromeTest {

    public LoginPage(WebDriver driver) {
        try{
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }catch (Exception e){
            System.out.println(e);
        }

    }
    By emailLocator = By.id("identifierId");
    By passwordLocator = By.name("Passwd");
    By identifierNextButtonLocator = By.id("identifierNext");
    By passwordNextButtonLocator = By.id("passwordNext");

    public LoginPage typeMail(String mail) {
        this.driver.findElement(emailLocator).sendKeys(mail);
        return this;
    }
    public LoginPage typePassword(String password) {
        try {
            driver.findElement(passwordLocator).sendKeys(password);
        }catch (Exception e)  {
            System.out.println("elementNoIntellectual    "+e);
        }
        return this;
    }
    public HomePage submitIdentifierNext() {
        this.driver.findElement(identifierNextButtonLocator).click();
        return new HomePage(driver);
    }
    public HomePage submitPasswordNext() {
        this.driver.findElement(passwordNextButtonLocator).click();
        return new HomePage(driver);
    }

    public HomePage loginAs(String email, String password) {
        try{
            typeMail(email);
            submitIdentifierNext();
            typePassword(password);

        }catch (Exception e){
            System.out.println(e);
        }
        return submitPasswordNext();
    }

}
