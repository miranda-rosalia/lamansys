package ebayTest.page;

import BaseTest.BaseChromeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ListProductPage extends BaseChromeTest {
    By listSearchLocator = By.cssSelector("srp-results.srp-list.clearfix");
    By productLocator = By.tagName("li");//className("s-item.s-item__pl-on-bottom");
    public ListProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public ProductObject firstProduct(){
        ProductPage product = new ProductPage(driver);
        return product.getProduct(driver.findElement(listSearchLocator).findElements(productLocator).get(1));
    }
}
