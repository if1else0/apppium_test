import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by Aaron on 2017/1/3.
 */
public class Login2 extends BasicTest {

    @Test
    public void testLogin2() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMyWithoutLogin().clickLoginIcon();
        assertEquals("277860602@qq.com",pm.getPageLogin().getName().getText().toString());
    }
}
