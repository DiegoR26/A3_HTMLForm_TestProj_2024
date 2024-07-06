package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "loginUsuario")
    private WebElement txLoginUsuario;

    @FindBy(id = "senhaUsuario")
    private WebElement txSenhaUsuario;

    @FindBy(id = "efetuarLogin")
    private WebElement btnEfetuarlogin;

    public LoginPage informarLoginUsuario (String login) {
        txLoginUsuario.sendKeys(login);
        return this;
    }

    public LoginPage informarSenhaUsuario (String senha) {
        txSenhaUsuario.sendKeys(senha);
        return this;
    }

    public LoginPage clicarEfetuarLogin () {
        btnEfetuarlogin.click();
        return this;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
