package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HomePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
    
    private By caixaUsuario = By.id("user-name");
    private By caixaSenha = By.id("password");
    private By botaoLogin = By.id("login-button");
  

    public void login(String usuario, String senha) {
        driver.findElement(caixaUsuario).sendKeys(usuario);
        driver.findElement(caixaSenha).sendKeys(senha);
        driver.findElement(botaoLogin).click();
         
        
    }

}
