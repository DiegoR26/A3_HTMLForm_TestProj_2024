import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExpensePage;

public class ExpensePageTest extends BaseTest {
    public ExpensePageTest() {
        super("ExpenseCRUD.html");
    }
    @Test
    public void ExpenseCRUD(){
        ExpensePage page = new ExpensePage(getDriver());
         String resultadoFinal = page.informarNomeDespesa("compra de bat-corda")
         .clicarAdicionarDespesa()
         .buscarResultadoCadastro();

         Assert.assertTrue(resultadoFinal.contains("compra de bat-corda"));
    }
}
