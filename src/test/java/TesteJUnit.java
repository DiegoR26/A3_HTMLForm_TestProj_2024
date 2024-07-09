import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pages.DSLPage;

public class TesteJUnit  {
	
	private WebDriver driver;
	private DSLPage dsl;

	@Before
	public void endereco(){
		driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/UserCRUD.html");
		dsl = new DSLPage(driver);
	}

	@After
	public void fechar(){
		driver.quit();
	}


	@Test
	public void testeUserCRUD() {
		dsl.escrever("nomeUsuario", "Quarteto Fantástico");
		dsl.escrever("emailUsuario", "Quarteto Fantástico");
		dsl.escrever("loginUsuario", "QuartetoGabaritoA3" );
		dsl.escrever("senhaUsuario", "Quarteto>Vingadores");
		dsl.escrever("telefoneCelular", "190");
		dsl.escrever("perfilUsuario", "Quarteto");
		dsl.selecionarElemento("ativo", "Não");
		dsl.click("adicionarUsuario");
		System.out.println(dsl.obterValorTabela("tableContainer"));
		
		
	}
	@Test
	public void testeErroUserCRUD() {
		dsl.escrever("nomeUsuario", "Quarteto Fantástico");
		dsl.escrever("emailUsuario", "Quarteto Fantástico");
		dsl.selecionarElemento("ativo", "Não");
		dsl.click("adicionarUsuario");
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Por favor, preencha todos os campos obrigatórios.", alert.getText());
		System.out.println(alert.getText());
		
		
	}


}