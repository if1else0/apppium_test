import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Aaron on 2017/1/13.
 */
public class UIHelper2 {
    private AppiumDriver driver;

    public UIHelper2(AppiumDriver driver){
        this.driver = driver;
    }

    public WebElement findById(String id){
        waitForElement(By.id(id));
        return driver.findElementById(id);
    }

    public WebElement findByText(String text){
        waitForElement(By.name(text));
        return driver.findElementByName(text);
    }


    public void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


}
