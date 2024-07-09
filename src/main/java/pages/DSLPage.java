package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSLPage {

    private WebDriver driver;    
    
    public DSLPage(WebDriver driver) {
        this.driver = driver;
    }

    public void escrever(String id_campo, String texto){
        driver.findElement(By.id(id_campo)).sendKeys(texto);
    }

    public String obterValorTabela(String id_tabela){
    return  driver.findElement(By.id(id_tabela)).getText();
    }
    public void click(String id_campo){
        driver.findElement(By.id(id_campo)).click();
    }
    public void selecionarElemento(String id_campo, String texto){
        WebElement elemnt = driver.findElement(By.id(id_campo));
		Select combo = new Select(elemnt);
		combo.selectByVisibleText(texto);
    }

}
