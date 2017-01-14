import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Created by Aaron on 2017/1/13.
 */
public class Login22 extends BasicTestCase {

    @Test
    public void testLogin22() throws Exception {
        pm.getPageCommon2().goToMyTab();
        pm.getPageMyWithoutLogin2().clickLoginIcon();
        pm.getPageLogin2().enterName("你好");
       assertNotEquals("你好", pm.getPageLogin2().getNameET().getText().toString());
    }
}
