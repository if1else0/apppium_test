import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by Aaron on 2017/1/2.
 */
public class ClassTest {
    private AppiumDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"), "apk/oschina.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "My Device");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appActivity", "net.oschina.app.LaunchActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void testClass() throws Exception {
        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.className("android.widget.ImageView"));
        ele.click();

//        List<WebElement> eles = driver.findElements(By.className("android.widget.ImageView"));
//        eles.get(1).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
