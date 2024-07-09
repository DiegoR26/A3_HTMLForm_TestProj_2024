import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteJUnit  {
	
	
	@Test
	public void testeUserCRUD() {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/UserCRUD.html");
		driver.findElement(By.id("nomeUsuario")).sendKeys("Quarteto Fantástico");
		driver.findElement(By.id("emailUsuario")).sendKeys("quartetofantastico.com.br");
		driver.findElement(By.id("loginUsuario")).sendKeys("QuartetoGabaritoA3");
		driver.findElement(By.id("senhaUsuario")).sendKeys("Quarteto>Vingadores");
		driver.findElement(By.id("telefoneCelular")).sendKeys("190");
		driver.findElement(By.id("perfilUsuario")).sendKeys("Quarteto");
		WebElement elemnt = driver.findElement(By.id("ativo"));
		Select combo = new Select(elemnt);
		combo.selectByVisibleText("Não");
		driver.findElement(By.id("adicionarUsuario")).click();
		driver.quit();
		
	}
	@Test
	public void testeErroUserCRUD() {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/html/UserCRUD.html");
		driver.findElement(By.id("nomeUsuario")).sendKeys("Quarteto Fantástico");
		driver.findElement(By.id("emailUsuario")).sendKeys("quartetofantastico.com.br");
		WebElement elemnt = driver.findElement(By.id("ativo"));
		Select combo = new Select(elemnt);
		combo.selectByVisibleText("Não");
		driver.findElement(By.id("adicionarUsuario")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Por favor, preencha todos os campos obrigatórios.", alert.getText());
		System.out.println(alert.getText());
		driver.quit();
		
	}


}