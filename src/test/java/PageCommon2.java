import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2017/1/13.
 */
public class PageCommon2 {
    UIHelper2 helper;
    WebElement homeTab,myTab;

    public PageCommon2(UIHelper2 helper){
        this.helper = helper;
    }

    public void initViews(){
        homeTab = helper.findById("net.oschina.app:id/nav_item_news");
        myTab = helper.findById("net.oschina.app:id/nav_item_me");
    }

    public void goToHomeTab(){
        homeTab.click();
    }

    public void goToMyTab(){
        myTab.click();
    }


}
