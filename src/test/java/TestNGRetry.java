import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Aaron on 2017/1/3.
 */
public class TestNGRetry implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount=1;

    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            String message = "running retry for  '" + iTestResult.getName() + "' on class " +
                    this.getClass().getName() + " Retrying " + retryCount + " times";
            System.out.println(message);
            retryCount++;
            return true;
        }
        return false;
    }
}
