package ebayTest;

import BaseTest.BaseChromeTest;
import ebayTest.page.ListProductPage;
import ebayTest.page.HomePage;
import org.junit.jupiter.api.Test;
import org.slf4j.helpers.AbstractLogger;

import java.util.logging.Logger;

public class EbayTest extends BaseChromeTest {
    private static String PAGE_URL="https://www.ebay.com/";
    private Logger logger = Logger.getLogger("Running EbayTest");
    @Test
    public void searchForProduct() {
        try {

            logger.info("Running Test searchForProduct()");
            driver.get(PAGE_URL);
            HomePage homePage = new HomePage(driver);
            ListProductPage listProductPage = homePage.searchFor("Electric Guitar");
            listProductPage.firstProduct();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
