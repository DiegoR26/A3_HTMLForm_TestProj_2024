package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreditorPage extends BasePage {

    @FindBy(id = "nomeCredor")
    private WebElement txNomeCredor;

    @FindBy(id = "responsavelCredor")
    private WebElement txResponsavelCredor;

    @FindBy(id = "telefoneCredor")
    private WebElement txTelefoneCredor;

    @FindBy(id = "celularCredor")
    private WebElement txCelularCredor;

    @FindBy(id = "ativo")
    private WebElement selAtivo;

    @FindBy(id = "adicionarCredor")
    private WebElement btnAdicionarCredor;

    @FindBy(id = "atualizarCredor")
    private WebElement btnAtualizarCredor;


    public CreditorPage informarNomeCredor (String nome) {
        txNomeCredor.sendKeys(nome);
        return this;
    }

    public CreditorPage informarResponsavelCredor (String responsavel) {
        txResponsavelCredor.sendKeys(responsavel);
        return this;
    }

    public CreditorPage informarTelefoneCredor (String telefone) {
        txTelefoneCredor.sendKeys(telefone);
        return this;
    }

    public CreditorPage informarCelularCredor (String celular) {
        txCelularCredor.sendKeys(celular);
        return this;
    }

    public CreditorPage selecionarAtivo (String ativo) {
        Select dropdown = new Select(selAtivo);
        dropdown.selectByVisibleText(ativo);
        return this;
    }

    public CreditorPage clicarAdicionarCredor () {
        btnAdicionarCredor.click();
        return this;
    }

    public CreditorPage clicarAtualizarCredor () {
        btnAtualizarCredor.click();
        return this;
    }

    public CreditorPage(WebDriver driver) {
        super(driver);
    }
}
