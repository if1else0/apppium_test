import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

/**
 * Created by Aaron on 2017/1/2.
 */
public class WaitFoTest {
    private AppiumDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"),"apk/oschina.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","My Device");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appActivity", "net.oschina.app.LaunchActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @Test
    public void waitForTest() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iv_arrow_down")));
        WebElement add = driver.findElement(By.id("net.oschina.app:id/iv_arrow_down"));
        add.click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
