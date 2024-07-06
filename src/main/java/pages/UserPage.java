package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserPage extends BasePage {

    @FindBy(id = "nomeUsuario")
    private WebElement txNomeUsuario;

    @FindBy(id = "emailUsuario")
    private WebElement emEmailUsuario;

    @FindBy(id = "loginUsuario")
    private WebElement txLoginUsuario;

    @FindBy(id = "senhaUsuario")
    private WebElement txSenhaUsuario;

    @FindBy(id = "telefoneCelular")
    private WebElement txTelefoneCelular;

    @FindBy(id = "perfilUsuario")
    private WebElement txPerfilUsuario;

    @FindBy(id = "ativo")
    private WebElement selAtivo;

    @FindBy(id = "adicionarUsuario")
    private WebElement btnAdicionarUsuario;

    @FindBy(id = "atualizarUsuario")
    private WebElement btnAtualizarUsuario;

    public UserPage informarNomeUsuario (String nome) {
        txNomeUsuario.sendKeys(nome);
        return this;
    }

    public UserPage informarEmailUsuario (String email) {
        emEmailUsuario.sendKeys(email);
        return this;
    }

    public UserPage informarLoginUsuario (String login) {
        txLoginUsuario.sendKeys(login);
        return this;
    }

    public UserPage informarSenhaUsuario (String senha) {
        txSenhaUsuario.sendKeys(senha);
        return this;
    }

    public UserPage informarTelefoneCelular (String telefone) {
        txTelefoneCelular.sendKeys(telefone);
        return this;
    }

    public UserPage informarPerfilUsuario (String perfil) {
        txPerfilUsuario.sendKeys(perfil);
        return this;
    }

    public UserPage selecionarAtivo (String ativo) {
        Select dropdown = new Select(selAtivo);
        dropdown.selectByVisibleText(ativo);
        return this;
    }

    public UserPage clicarAdicionarUsuario () {
        btnAdicionarUsuario.click();
        return this;
    }

    public UserPage clicarAtualizarusuario () {
        btnAtualizarUsuario.click();
        return this;
    }

    public UserPage(WebDriver driver) {
        super(driver);
    }
}
