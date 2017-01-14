import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Aaron on 2017/1/13.
 */
public class Retrier implements IRetryAnalyzer {
    int index = 0;
    int maxRerunTimes = 1;

    public boolean retry(ITestResult iTestResult) {
        if(index < maxRerunTimes){
            System.out.println(iTestResult.getClass()+"."+iTestResult.getName()+"Test script reruning.......");
            index++;
            return true;
        }
        return false;
    }
}
