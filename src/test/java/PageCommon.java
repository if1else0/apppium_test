import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2017/1/3.
 */
public class PageCommon {
    private UIHelper helper;
    WebElement homeTab,myTab;

    public PageCommon(UIHelper helper){
        this.helper = helper;
    }

    public void initViews(){
        homeTab = helper.findElementsById("net.oschina.app:id/nav_tv_title").get(0);
        myTab = helper.findElementsById("net.oschina.app:id/nav_tv_title").get(3);
    }

    public void goToHomeTab(){
        helper.click(homeTab);
    }

    public void goToMyTab(){
        helper.click(myTab);
    }

}
