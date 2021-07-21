package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProdutoPage extends HomePage {
	private By container = By.className("product_sort_container");
	private By botao = By.cssSelector(".shopping_cart_badge");

    public ProdutoPage(WebDriver driver) {
        super(driver);
    }

    public void addProduto(String cssProduto) {
    	driver.findElement(By.cssSelector(cssProduto)).click();
    }
    
    public void ordena(String selecao) {
        WebElement elemento = driver.findElement(container);
        Select seletor = new Select(elemento);
        seletor.selectByVisibleText(selecao);
        
    }
    public void carrinho() {
    	driver.findElement(botao).click();
    }
    

}
