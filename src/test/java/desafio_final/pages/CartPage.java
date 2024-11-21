package desafio_final.pages;

import desafio_final.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(id = "cartur")
    private WebElement carrinho;
    @FindBy(xpath ="//button[text()='Place Order']")
    private WebElement placeOrder;

    @FindBy(id = "name")
    private WebElement campoNome;

    @FindBy(id = "country")
    private WebElement campoPais;

    @FindBy(id = "city")
    private WebElement campoCidade;

    @FindBy(id = "card")
    private WebElement campoCartao;

    @FindBy(id = "month")
    private WebElement campoMes;

    @FindBy(id = "year")
    private WebElement campoAno;

    @FindBy(xpath = "//button[text()='Purchase']")
    private WebElement botaoPurchase;


    public CartPage(WebDriver navegador) {
        super(navegador);
    }
    public CartPage abrirCarrinho(){
        carrinho.click();
        placeOrder.click();

        return new CartPage(navegador);

    }
    public CartPage preencherOrder(String nome, String country, String city, String card, String month, int year){
        campoNome.sendKeys("name");
        campoPais.sendKeys("country");
        campoCidade.sendKeys("city");
        campoCartao.sendKeys("card");
        campoMes.sendKeys("month");
        campoAno.sendKeys(String.valueOf(year));

        return new CartPage(navegador);

    }
    public CheckoutPage enviar(){
        botaoPurchase.click();

        return new CheckoutPage(navegador);
    }
}
