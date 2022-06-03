import org.testng.annotations.Test;
public class Testclass extends BaseClassIcc {
    IccHomePage page;

    @Test
    public void verifyLive(){
        page=new IccHomePage(driver);
        page.ClickonLive();
    }







}
