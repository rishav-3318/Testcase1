import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClassIcc {
    public WebDriver driver;
    @BeforeClass
    public void  OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.2.3\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.icc-cricket.com/");
        driver.manage().window().maximize();
    }
}
