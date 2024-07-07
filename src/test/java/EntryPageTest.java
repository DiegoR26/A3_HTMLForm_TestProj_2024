import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryPage;

public class EntryPageTest extends BaseTest {

    public EntryPageTest() {
        super("EntryCRUD.html");
    }
    @Test
    public void EntryCRUDTest(){
        EntryPage page = new EntryPage(getDriver());

        String resultadoFinal = page.informarCompetenciaDespesa("2024")
        .informarDataVencimento("02/02/2024")
        .informarValorOriginal("123,456")
        .informarValorMulta("123,45")
        .informarValorCorrecao("12,34")
        .clicarAdicionarLancamento()
        .buscarResultadoCadastro();

        Assert.assertTrue(resultadoFinal.contains("2024"));
        Assert.assertTrue(resultadoFinal.contains("02/02/2024"));
        Assert.assertTrue(resultadoFinal.contains("123,456"));
        Assert.assertTrue(resultadoFinal.contains("123,45"));
        Assert.assertTrue(resultadoFinal.contains("12,34"));
    }
}
