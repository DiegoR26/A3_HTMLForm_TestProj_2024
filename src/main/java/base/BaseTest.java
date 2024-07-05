package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.annotations.BeforeClass;

public class BaseTest {
    public String driverPath;
    public WebDriver driver;

    @BeforeClass
    public void preCond() {
        driverPath = System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe";
        System.setProperty("webdriver.firefox.driver", driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
