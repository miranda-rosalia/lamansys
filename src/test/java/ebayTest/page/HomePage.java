package ebayTest.page;

import BaseTest.BaseChromeTest;
import gmailTest.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseChromeTest {

    By searchInputLocator = By.id("gh-ac");
    By searchButtonLocator = By.id("gh-btn");

    public HomePage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
    }
    public ListProductPage searchFor(String product) {
        typeProduct(product);
        return submitSearchProduct();
    }
    public ListProductPage typeProduct(String product) {
        this.driver.findElement(searchInputLocator).sendKeys(product);
        return new ListProductPage(driver);
    }
    public ListProductPage submitSearchProduct() {
        this.driver.findElement(searchButtonLocator).click();
        return new ListProductPage(driver);
    }
}
