package desafio_final.pages;

import desafio_final.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
    private WebElement saudacaoSucesso;

    @FindBy(xpath = "//p[@class='lead text-muted ']/text()[1]")
    private WebElement numeroOrdem;

    public CheckoutPage(WebDriver navegador) {
        super(navegador);
    }

    public String sucesso(){
        return saudacaoSucesso.getText();

    }
    public String idOrdem(){
        return numeroOrdem.getText();
    }
}
