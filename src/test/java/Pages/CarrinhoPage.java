package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class CarrinhoPage extends HomePage{
	private By seletor = By.cssSelector("*[data-test=\"checkout\"]");
    
	public CarrinhoPage(WebDriver driver) {
        super(driver);
    }
	
    public void checkout() {
    	driver.findElement(seletor).click();
    }
}
