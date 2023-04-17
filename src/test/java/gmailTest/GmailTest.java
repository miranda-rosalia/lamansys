package gmailTest;

import BaseTest.BaseChromeTest;
import gmailTest.page.HomePage;
import gmailTest.page.LoginPage;
import org.junit.jupiter.api.Test;

public class GmailTest extends BaseChromeTest {

    private static String PAGE_URL="www.https://gmail.com/";
    @Test
    public void testLogin() {
        try {
        driver.get(PAGE_URL);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.loginAs("test.automation.rmiranda@gmail.com", "123rosalia");

        }catch (Exception e){
            System.out.println(e);
        }
    }

}
