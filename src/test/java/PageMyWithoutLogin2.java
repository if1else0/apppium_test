import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2017/1/13.
 */
public class PageMyWithoutLogin2 {

    UIHelper2 helper;
    WebElement loginIcon;

    public PageMyWithoutLogin2(UIHelper2 helper){
        this.helper = helper;
    }

    public void initViews(){
        loginIcon = helper.findById("net.oschina.app:id/iv_portrait");
    }

    public void clickLoginIcon(){
        loginIcon.click();
    }

}
