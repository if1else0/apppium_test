import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2017/1/3.
 */
public class PageLogin {
    private UIHelper helper;
    WebElement name,pwd,loginBtn;

    public PageLogin(UIHelper helper){
        this.helper = helper;
    }
    public void initViews(){
        name = helper.findById("net.oschina.app:id/et_login_username");
        pwd = helper.findById("net.oschina.app:id/et_login_pwd");
        loginBtn = helper.findById("net.oschina.app:id/bt_login_submit");
    }
   public void enterName(String nameStr){
        helper.enterText(name,nameStr);
   }
    public void enterPwd(String pwdStr){
        helper.enterText(pwd,pwdStr);
    }

    public void clearName(){
        helper.clearText(name);
    }

    public void clearPwd(){
        helper.clearText(pwd);
    }

    public void clickLoginBtn(){
        helper.click(loginBtn);
    }

    public void login(String nameStr,String pwdStr){
        clearName();
        enterName(nameStr);
        clearPwd();
        enterPwd(pwdStr);
        clickLoginBtn();
    }

    public WebElement getLoginBtn(){
        return  loginBtn;
    }

    public WebElement getName(){
        return name;
    }

}
