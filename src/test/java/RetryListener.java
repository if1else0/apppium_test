import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Aaron on 2017/1/3.
 */
public class RetryListener implements IAnnotationTransformer {

    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        IRetryAnalyzer retry = iTestAnnotation.getRetryAnalyzer();
        if (retry == null) {
            iTestAnnotation.setRetryAnalyzer(TestNGRetry.class);
        }
    }
}
