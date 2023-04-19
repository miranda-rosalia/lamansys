package gmailTest;

import BaseTest.BaseChromeTest;
import gmailTest.page.HomePage;
import gmailTest.page.LoginPage;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class GmailTest extends BaseChromeTest {

    private static String PAGE_URL="https://www.gmail.com/";
    private Logger logger = Logger.getLogger("Running GmailTest");
    @Test
    public void testLogin() {
        try {
            logger.info("Running testLogin()");
            driver.get(PAGE_URL);
            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = loginPage.loginAs("test.automation.rmiranda@gmail.com", "123rosalia");
            homePage.validateProfile();
        }catch (Exception e){
            logger.info(e.toString());
        }
    }

}
