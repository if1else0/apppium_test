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
import java.util.Set;

/**
 * Created by Aaron on 2017/1/2.
 */
public class WebViewTest {
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
    public void testID() throws Exception {
        Thread.sleep(10000);
        driver.findElementByName("要闻").click();
        WebElement we = (WebElement) driver.findElementsById("com.netease.newsreader.activity:id/cg").get(2);
        we.click();
        Thread.sleep(20000);
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            System.out.println("-----------------"+contextName);

        }
        String last = contextNames.toArray()[contextNames.size()-1].toString();
        if (last.contains("WEBVIEW")){
            driver.context(last);
        }
        WebElement title = driver.findElementByXPath("//*[@id=\"article_body\"]/div[2]/div[1]");
        System.out.println("===================="+title.getText().toString());
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
