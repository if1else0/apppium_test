import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.URL;

/**
 * Created by Aaron on 2017/1/13.
 */
public class BasicTestCase {
    static AppiumDriver driver;
    private UIHelper2 helper;
    protected PageManager2 pm;

    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"),"apk/oschina.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","My Device");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("unicodeKeyboard",true);
        capabilities.setCapability("resetKeyboard",true);
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("appActivity", "net.oschina.app.LaunchActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        helper = new UIHelper2(driver);
        pm = new PageManager2(helper);
    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
