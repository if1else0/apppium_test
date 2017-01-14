import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Aaron on 2017/1/13.
 */
public class Login11 extends  BasicTestCase{

    @Test
    public void testLogin11() throws Exception {
        pm.getPageCommon2().goToMyTab();
        pm.getPageMyWithoutLogin2().clickLoginIcon();
        pm.getPageLogin2().login("277860602@qq.com","1234600");
        assertTrue(pm.getPageLogin2().isNameETEnable());
    }
}
