package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EntryPage extends BasePage {

    @FindBy(id = "idBase")
    private WebElement txIdBase;

    @FindBy(id = "idUsuario")
    private WebElement txIdUsuario;

    @FindBy(id = "idDespesa")
    private WebElement txIdDespesa;

    @FindBy(id = "competenciaDespesa")
    private WebElement txCompetenciaDespesa;

    @FindBy(id = "dataVencimento")
    private WebElement dtDataVencimento;

    @FindBy(id = "valorOriginal")
    private WebElement txValorOriginal;

    @FindBy(id = "valorMulta")
    private WebElement txValorMulta;

    @FindBy(id = "valorCorrecao")
    private WebElement txValorCorrecao;

    @FindBy(id = "ativo")
    private WebElement selAtivo;

    @FindBy(id = "observacao")
    private WebElement txObservacao;

    @FindBy(id = "adicionarLancamento")
    private WebElement btnAdicionarLancamento;

    @FindBy(id = "atualizarLancamento")
    private WebElement btnAtualizarLancamento;


    public EntryPage informarIdBase (String idBase) {
        txIdBase.sendKeys(idBase);
        return this;
    }

    public EntryPage informarIdUsuario (String idUsuario) {
        txIdUsuario.sendKeys(idUsuario);
        return this;
    }

    public EntryPage informarIdDespesa (String idDespesa) {
        txIdDespesa.sendKeys(idDespesa);
        return this;
    }

    public EntryPage informarCompetenciaDespesa (String competencia) {
        txCompetenciaDespesa.sendKeys(competencia);
        return this;
    }

    public EntryPage informarDataVencimento (String data) {
        dtDataVencimento.sendKeys(data);
        return this;
    }

    public EntryPage informarValorOriginal (String vlrOriginal) {
        txValorOriginal.sendKeys(vlrOriginal);
        return this;
    }

    public EntryPage informarValorMulta (String vlrMulta) {
        txValorMulta.sendKeys(vlrMulta);
        return this;
    }

    public EntryPage informarValorCorrecao (String vlrCorrecao) {
        txValorCorrecao.sendKeys(vlrCorrecao);
        return this;
    }

    public EntryPage informarObservacao (String obs) {
        txObservacao.sendKeys(obs);
        return this;
    }

    public EntryPage selecionarAtivo (String ativo) {
        Select dropdown = new Select(selAtivo);
        dropdown.selectByVisibleText(ativo);
        return this;
    }

    public EntryPage clicarAdicionarLancamento () {
        btnAdicionarLancamento.click();
        return this;
    }

    public EntryPage clicarAtualizarLancamento () {
        btnAtualizarLancamento.click();
        return this;
    }

    public EntryPage(WebDriver driver) {
        super(driver);
    }
}
