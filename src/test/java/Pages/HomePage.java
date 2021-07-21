package Pages;

import org.openqa.selenium.WebDriver;

abstract class HomePage {
	
	private String url = "https://www.saucedemo.com";
	protected WebDriver driver;

    public String carregaSite() {
        return url;
    }
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

}
