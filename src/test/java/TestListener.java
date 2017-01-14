import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aaron on 2017/1/3.
 */
public class TestListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {
        captureScreenShot(iTestResult);
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    public void captureScreenShot(ITestResult result) {
        String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
        // To capture screenshot.
        File scrFile = ((TakesScreenshot) BasicTest.driver).getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String  destDir = "screenshots/Failures";
        new File(destDir).mkdirs();
        String destFile = passfailMethod + " - " + dateFormat.format(new Date()) + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
