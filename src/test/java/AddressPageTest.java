import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;

public class AddressPageTest extends BaseTest {

    @Test
    public void inserirNomeDaBase() {
        AddressPage page = new AddressPage(getDriver());

        String resultadoFinal = page.informarNomeBase("Santanna do Livramento").toString();

        Assert.assertTrue(resultadoFinal.contains("Santanna do Livramento"));
    }

    public AddressPageTest() {
        super("AddressCRUD.html");
    }
}
