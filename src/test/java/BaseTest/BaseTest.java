package BaseTest;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;


    @AfterEach
    public void quit() {

        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.quit();
    }

}
