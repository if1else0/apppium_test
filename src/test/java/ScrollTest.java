import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

/**
 * Created by Aaron on 2017/1/2.
 */
public class ScrollTest {
    AndroidDriver<AndroidElement> driver;
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
    public void testScroll() throws Exception {
        Thread.sleep(5000);
        AndroidElement list = driver.findElement(By.id("net.oschina.app:id/recyclerView"));
        MobileElement titles = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().textContains(\"IndexR —— 分布式列式数据库\"));"));
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
