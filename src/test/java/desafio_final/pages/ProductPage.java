package desafio_final.pages;

import desafio_final.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    @FindBy(xpath ="//a[@class='hrefch' and text()='ASUS Full HD']")
    private WebElement monitorAsus;
    @FindBy(xpath ="//a[@onclick='addToCart(14)']")
    private WebElement botaoCart;
    public ProductPage(WebDriver navegador) {
        super(navegador);
    }



    public ProductPage abrirMonitorAsus(){
        monitorAsus.click();

        return new ProductPage(navegador);
    }
    public void addToCart(){
        botaoCart.click();

        // Aceita o alerta que aparece após adicionar ao carrinho
        aceitaAlerta();
    }
    public void aceitaAlerta(){
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = navegador.switchTo().alert();
        alert.accept();
    }
}
