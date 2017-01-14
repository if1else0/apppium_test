import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2017/1/13.
 */
public class PageLogin2 {

    UIHelper2 helper;
    WebElement nameET,pwdET,loginBtn;

    public PageLogin2(UIHelper2 helper){
        this.helper = helper;
    }

    public void initViews(){
        nameET = helper.findById("net.oschina.app:id/et_login_username");
        pwdET = helper.findById("net.oschina.app:id/et_login_pwd");
        loginBtn = helper.findById("net.oschina.app:id/bt_login_submit");
    }

    public void enterName(String name){
        nameET.sendKeys(name);
    }

    public void enterPwd(String pwd){
        pwdET.sendKeys(pwd);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

    public void login(String name,String pwd){
        nameET.clear();
        enterName(name);
        pwdET.clear();
        enterPwd(pwd);
        clickLoginBtn();
    }

    public boolean isNameETEnable(){
        return nameET.isEnabled();
    }

    public WebElement getNameET(){
        return nameET;
    }

}
