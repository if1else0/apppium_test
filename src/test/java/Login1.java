import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Aaron on 2017/1/3.
 */
public class Login1 extends BasicTest {

    @Test
    public void testLogin1() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMyWithoutLogin().clickLoginIcon();
        pm.getPageLogin().login("helloworld","123456");
        assertTrue(pm.getPageLogin().getLoginBtn().isEnabled());
    }
}
