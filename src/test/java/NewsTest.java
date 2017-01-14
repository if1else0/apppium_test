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

/**
 * Created by Aaron on 2017/1/2.
 */
public class NewsTest {
    private AppiumDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"),"apk/news.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","My Device");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("noSign",true);
        capabilities.setCapability("appActivity", "com.netease.nr.biz.ad.AdActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @Test
    public void testNews() throws Exception {
        Thread.sleep(8000);
        driver.findElement(By.name("要闻")).click();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
