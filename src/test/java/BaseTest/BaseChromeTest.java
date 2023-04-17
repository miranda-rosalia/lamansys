package BaseTest;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class BaseChromeTest extends BaseTest{
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        System.setProperty("webdriver.chrome.allowedIp", "");
        System.setProperty("webdriver.http.factory", "jdk-http-client");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("webdriver.chrome.unhandledPromptBehavior: dismiss");
 //       options.addArguments("--enable-automation");
       //("unhandledPromptBehavior","dismiss");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(options);
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




}
