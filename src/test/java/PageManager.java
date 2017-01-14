/**
 * Created by Aaron on 2017/1/3.
 */
public class PageManager {
    private UIHelper helper;
    private PageCommon pageCommon;
    private PageLogin pageLogin;
    private PageMyWithoutLogin pageMyWithoutLogin;

    public PageManager(UIHelper helper){
        this.helper = helper;
    }

    public PageCommon getPageCommon(){
        if(pageCommon == null){
            pageCommon = new PageCommon(helper);
        }
        pageCommon.initViews();
        return pageCommon;
    }

    public PageLogin getPageLogin(){
        if(pageLogin == null){
            pageLogin = new PageLogin(helper);
        }
        pageLogin.initViews();
        return pageLogin;
    }

    public PageMyWithoutLogin getPageMyWithoutLogin(){
        if(pageMyWithoutLogin == null){
            pageMyWithoutLogin = new PageMyWithoutLogin(helper);
        }
        pageMyWithoutLogin.initViews();
        return pageMyWithoutLogin;
    }


}
