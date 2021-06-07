package FourYouSee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    protected static WebDriverWait wait;
    protected static String url = "https://qa3.4yousee.com.br/admin/index.php";

    public BaseTest() {startDriver(true);}
    protected void startDriver(boolean maximizar){
        if (driver == null){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lnv\\Desktop\\JAVA\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,5);

        if (maximizar == true){
        driver.manage().window().maximize();
            }
        }
    }
}
