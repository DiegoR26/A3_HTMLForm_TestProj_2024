package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Pagefactory;

public class BasePage {
    protected Webdriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        Pagefactory.initElements(driver,this);
    }
}
