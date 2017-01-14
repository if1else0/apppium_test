import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

/**
 * Created by Aaron on 2017/1/3.
 */
public class Login3 extends BasicTest {

    @Test
    public void testLogin2() throws Exception {
        pm.getPageCommon().goToMyTab();
        pm.getPageMyWithoutLogin().clickLoginIcon();
        assertNotEquals("277860602@qq.com", pm.getPageLogin().getName().getText().toString());
    }
}
