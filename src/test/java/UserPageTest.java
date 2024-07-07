import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserPage;

public class UserPageTest extends BaseTest {

    public UserPageTest() {
        super("UserCRUD.html");
    }
    @Test
    public void UserCRUDTest(){
        UserPage page = new UserPage(getDriver());
        String resultadofinal = page.informarNomeUsuario("Bruce Wayne")
        .informarEmailUsuario("Bruce@notBatman.com")
        .informarEmailUsuario("batman")
        .informarSenhaUsuario("123")
        .informarTelefoneCelular("123456789")
        .informarPerfilUsuario("adm")
        .clicarAdicionarUsuario()
        .buscarResultadoCadastro();

        Assert.assertTrue(resultadofinal.contains("Bruce Wayne"));
        Assert.assertTrue(resultadofinal.contains("Bruce@notBatman.com"));
        Assert.assertTrue(resultadofinal.contains("batman"));
        Assert.assertTrue(resultadofinal.contains("123"));
        Assert.assertTrue(resultadofinal.contains("123456789"));
        Assert.assertTrue(resultadofinal.contains("adm"));

    }
}
