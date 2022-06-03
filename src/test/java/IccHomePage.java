import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class IccHomePage extends BaseClassIcc {
    By live= By.xpath("//div[contains(.,'Live')]/*[local-name()='svg' and @class='icon']");

    public IccHomePage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickonLive(){
        WebElement element=driver.findElement(live);
        Actions action=new Actions(driver);
        action.moveToElement(element).perform();
    }
}
