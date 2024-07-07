import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;

public class AddressPageTest extends BaseTest {

    @Test
    public void AddressCRUDTest() {
        AddressPage page = new AddressPage(getDriver());

        String resultadoFinal = page.informarNomeBase("Santanna do Livramento")
        .informarResponsavelBase("Batman")
        .informarTelefoneBase("123456789")
        .informarCelularBase("987654321")
        .informarEmailBase("batman@batcave.com")
        .clicarAdicionarBase()
        .buscarResultadoCadastro();

        Assert.assertTrue(resultadoFinal.contains("Santanna do Livramento"));
        Assert.assertTrue(resultadoFinal.contains("Batman"));
        Assert.assertTrue(resultadoFinal.contains("123456789"));
        Assert.assertTrue(resultadoFinal.contains("987654321"));
        Assert.assertTrue(resultadoFinal.contains("batman@batcave.com"));
    }


    public AddressPageTest() {
        super("AddressCRUD.html");
    }
}
