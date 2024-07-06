package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressPage extends BasePage {

    @FindBy(id = "idUsuario")
    private WebElement txIdUsuario;

    @FindBy(id = "nomeBase")
    private WebElement txNomeBase;

    @FindBy(id = "responsavelBase")
    private WebElement txResponsavelBase;

    @FindBy(id = "telefoneBase")
    private WebElement txTelefoneBase;

    @FindBy(id = "celularBase")
    private WebElement txCelularBase;

    @FindBy(id = "emailBase")
    private WebElement emEmailBase;

    @FindBy(id = "ativo")
    private WebElement selAtivo;

    @FindBy(id = "adicionarBase")
    private WebElement btnAdicionarBase;

    @FindBy(id = "atualizarBase")
    private WebElement btnAtualizarBase;

    public AddressPage informarIdUsuario (String id) {
        txIdUsuario.sendKeys(id);
        return this;
    }

    public AddressPage informarNomeBase (String base) {
        txNomeBase.sendKeys(base);
        return this;
    }

    public AddressPage informarResponsavelBase (String responsavel) {
        txResponsavelBase.sendKeys(responsavel);
        return this;
    }

    public AddressPage informarTelefoneBase (String telefone) {
        txTelefoneBase.sendKeys(telefone);
        return this;
    }

    public AddressPage informarCelularBase (String celular) {
        txCelularBase.sendKeys(celular);
        return this;
    }

    public AddressPage informarEmailBase (String email) {
        emEmailBase.sendKeys(email);
        return this;
    }

    public AddressPage selecionarAtivo (String ativo) {
        Select dropdown = new Select(selAtivo);
        dropdown.selectByVisibleText(ativo);
        return this;
    }

    public AddressPage clicarAdicionarBase () {
        btnAdicionarBase.click();
        return this;
    }

    public AddressPage clicarAtualizarBase () {
        btnAtualizarBase.click();
        return this;
    }

    public AddressPage(WebDriver driver) {
        super(driver);
    }
}
