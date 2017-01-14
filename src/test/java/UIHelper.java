import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Aaron on 2017/1/3.
 */
public class UIHelper {
    private AppiumDriver driver;

    public UIHelper(AppiumDriver driver){
        this.driver = driver;
    }

    public WebElement findById(String id){
        waitForElement(By.id(id));
        return driver.findElementById(id);
    }

    public void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement findByText(String name){
        waitForElement(By.name(name));
        return driver.findElementByName(name);
    }

    public WebElement findByClassName(String className){
        waitForElement(By.name(className));
        return driver.findElementByClassName(className);
    }

    public List<WebElement> findElementsById(String id){
        waitForElement(By.id(id));
        return driver.findElementsById(id);
    }

    public void click(WebElement element){
        element.click();
    }

    public void enterText(WebElement element,String text){
        element.sendKeys(text);
    }

    public void clearText(WebElement element){
        element.clear();
    }
}
