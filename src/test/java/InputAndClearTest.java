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
public class InputAndClearTest {
    private AppiumDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"),"apk/oschina.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","My Device");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appActivity", "net.oschina.app.LaunchActivity");
        capabilities.setCapability("unicodeKeyboard",true);
        capabilities.setCapability("resetKeyboard",true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @Test
    public void testID() throws Exception {
        Thread.sleep(5000);
        WebElement my = driver.findElement(By.name("我的"));
        my.click();
        WebElement loginIcon = driver.findElementById("net.oschina.app:id/iv_portrait");
        loginIcon.click();
        WebElement name = driver.findElementById("net.oschina.app:id/et_login_username");
        name.clear();
        name.sendKeys("277860602@qq.com");
        name.clear();
        name.sendKeys("你好");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
