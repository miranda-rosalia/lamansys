package ebayTest;

import BaseTest.BaseChromeTest;
import ebayTest.page.ListProductPage;
import ebayTest.page.HomePage;
import org.junit.jupiter.api.Test;

public class EbayTest extends BaseChromeTest {
    private static String PAGE_URL="https://www.ebay.com/";
    @Test
    public void searchForProduct() {
        try {
            driver.get(PAGE_URL);
            HomePage homePage = new HomePage(driver);
            ListProductPage listProductPage = homePage.searchFor("Electric Guitar");
            listProductPage.firstProduct();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
