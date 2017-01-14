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
 * Created by Aaron on 2017/1/13.
 */
public class TestListener2 implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("=================Test start:");
    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {
            takeScreenShot(iTestResult);
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    public void takeScreenShot(ITestResult iTestResult){
        String passfailMethod = iTestResult.getMethod().getRealClass().getSimpleName() + "." + iTestResult.getMethod().getMethodName();
        // To capture screenshot.
        File scrFile = ((TakesScreenshot) BasicTestCase.driver).getScreenshotAs(OutputType.FILE);
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
