import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddressPage;
import pages.CreditorPage;

public class CreditorPageTest extends BaseTest {
    
    public CreditorPageTest() {
        super("CreditorCRUD.html");
    }
    @Test

    public void CreditorCRUDTest(){
        CreditorPage page = new CreditorPage(getDriver());

        String resultadoFinal = page.informarNomeCredor("Robin")
        .informarResponsavelCredor("Batman")
        .informarTelefoneCredor("123456789")
        .informarCelularCredor("987654321")
        .clicarAdicionarCredor()
        .buscarResultadoCadastro();

        Assert.assertTrue(resultadoFinal.contains("Robin"));
        Assert.assertTrue(resultadoFinal.contains("Batman"));
        Assert.assertTrue(resultadoFinal.contains("123456789"));
        Assert.assertTrue(resultadoFinal.contains("987654321"));

    }
}
