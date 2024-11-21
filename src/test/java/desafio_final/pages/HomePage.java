package desafio_final.pages;

import desafio_final.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath ="//a[text()='Monitors']")
    private WebElement botaoMonitors;

    public HomePage(WebDriver navegador) {
        super(navegador);
    }
    public HomePage acessarPaginaHome(){
        navegador.get("https://www.demoblaze.com/index.html");

        return new HomePage(navegador);
    }
    public ProductPage abrirPaginaMonitores(){
        botaoMonitors.click();

        return new ProductPage(navegador);

    }


}
