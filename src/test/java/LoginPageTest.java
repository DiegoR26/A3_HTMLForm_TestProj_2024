import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    public LoginPageTest() {
        super("LoginPage.html");
    }
    @Test
    public void LoginPageTest(){
        LoginPage page = new LoginPage(getDriver());
        String resultadoFinal = page.informarLoginUsuario("adm")
        .informarSenhaUsuario("123")
        .clicarEfetuarLogin()
        .buscarResultadoCadastro();

        Assert.assertTrue(resultadoFinal.contains("adm"));
        Assert.assertFalse(resultadoFinal.contains("123"));
    }
}
