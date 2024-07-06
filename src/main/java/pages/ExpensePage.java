package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ExpensePage extends BasePage {

    @FindBy(id = "idCredor")
    private WebElement txIdCredor;

    @FindBy(id = "idUsuario")
    private WebElement txIdUsuario;

    @FindBy(id = "nomeDespesa")
    private WebElement txNomeDespesa;

    @FindBy(id = "ativo")
    private WebElement selAtivo;

    @FindBy(id = "adicionarDespesa")
    private WebElement btnAdicionarDespesa;

    @FindBy(id = "atualizarDespesa")
    private WebElement btnAtualizarDespesa;

    public ExpensePage informarIdCredor (String idCredor ) {
        txIdCredor.sendKeys(idCredor);
        return this;
    }

    public ExpensePage informarIdUsuario (String idUsuario) {
        txIdUsuario.sendKeys(idUsuario);
        return this;
    }

    public ExpensePage informarNomeDespesa (String nome) {
        txNomeDespesa.sendKeys(nome);
        return this;
    }

    public ExpensePage selecionarAtivo (String ativo) {
        Select dropdown = new Select(selAtivo);
        dropdown.selectByVisibleText(ativo);
        return this;
    }

    public ExpensePage clicarAdicionarDespesa () {
        btnAdicionarDespesa.click();
        return this;
    }

    public ExpensePage clicarAtualizarDespesa () {
        btnAtualizarDespesa.click();
        return this;
    }

    public ExpensePage(WebDriver driver) {
        super(driver);
    }
}
