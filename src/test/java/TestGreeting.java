import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestGreeting {
    WebDriver driver;
    public void InvokeBrowser() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void Test1() {
        try {
            InvokeBrowser();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
