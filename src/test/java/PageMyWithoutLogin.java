import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2017/1/3.
 */
public class PageMyWithoutLogin {
    private UIHelper helper;
    WebElement loginIcon;

    public PageMyWithoutLogin(UIHelper helper){
        this.helper = helper;
    }

    public void initViews(){
        loginIcon = helper.findById("net.oschina.app:id/iv_portrait");
    }

    public void clickLoginIcon(){
        helper.click(loginIcon);
    }

}
