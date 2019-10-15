

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class MyTest {

    private AppiumDriver driver;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "ff2a09d7");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("app", "C:\\Users\\Sander\\Downloads\\appsit.apk");

        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @Test
    public void myTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='Uitleg overslaan']"))).click();
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
