/**
 * Created by Aaron on 2017/1/13.
 */
public class PageManager2 {
    UIHelper2 helper;

    public PageManager2(UIHelper2 helper){
        this.helper = helper;
    }

    PageCommon2 pageCommon2;
    PageLogin2 pageLogin2;
    PageMyWithoutLogin2 pageMyWithoutLogin2;


    public PageCommon2 getPageCommon2(){
        if(pageCommon2 == null){
            pageCommon2 = new PageCommon2(helper);
        }
        pageCommon2.initViews();
        return pageCommon2;
    }

    public PageLogin2 getPageLogin2(){
        if(pageLogin2 == null){
            pageLogin2 = new PageLogin2(helper);
        }
        pageLogin2.initViews();
        return pageLogin2;
    }


    public PageMyWithoutLogin2 getPageMyWithoutLogin2(){
        if(pageMyWithoutLogin2 == null){
            pageMyWithoutLogin2 = new PageMyWithoutLogin2(helper);
        }
        pageMyWithoutLogin2.initViews();
        return pageMyWithoutLogin2;
    }


}
