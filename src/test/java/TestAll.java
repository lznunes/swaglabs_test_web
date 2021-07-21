
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Pages.LoginPage;
import Pages.ProdutoPage;
import Pages.CarrinhoPage;

public class TestAll {
	
    private static WebDriver driver;
    private static LoginPage login;
    private static ProdutoPage produto;
    private static CarrinhoPage carrinho;
    

    @BeforeAll
    public static void setUp() {
	   System.setProperty("webdriver.chrome.driver","/home/luiz/Documentos/PROJETOS/saucedemo/saucedemo/src/resource/webdrive/chromedriver");
       driver = new ChromeDriver();
       login = new LoginPage(driver);
       produto = new ProdutoPage(driver);
       carrinho = new CarrinhoPage(driver);
    }
    
    @Test
    public void realizarLogin() {
    	driver.get(login.carregaSite());
    	login.login("standard_user", "secret_sauce");  	
    }
    
    @Test
    public void ordenarProdutos() {
    	produto.ordena("Name (A to Z)");
    }
    
    @Test
    public void adicionarProdutos() {
    	produto.addProduto("*[data-test=\"add-to-cart-sauce-labs-onesie\"]");
    	produto.addProduto("*[data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
    	
    }
    
    @Test
    public void acessarCarrinho() {
    	produto.carrinho();
    	
    }
    
    @Test
    public void conclusaoCompra() {
    	carrinho.checkout();
    }
          
    
    @AfterAll
    public static void encerra() {
        driver.quit();
    }
    

}
