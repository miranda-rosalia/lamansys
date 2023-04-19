package ebayTest.page;

import BaseTest.BaseChromeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.helpers.AbstractLogger;

public class ProductPage extends BaseChromeTest {
    AbstractLogger logger;
    By titleLocator = By.className("s-item__title");
    By priceLocator = By.className("s-item__price");

    public ProductPage( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public ProductObject getProduct(WebElement webElement) {
        ProductObject productObject = new ProductObject();
        productObject.setTitle(webElement.findElements(titleLocator).toString());
        productObject.setPrice(webElement.findElements(priceLocator).toString());
        logger.info("Title Product : "+ productObject.getTitle());
        logger.info("Price Product : "+ productObject.getPrice());
        return productObject;
    }

}
