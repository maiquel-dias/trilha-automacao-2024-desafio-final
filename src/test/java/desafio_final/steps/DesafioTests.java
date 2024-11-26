package desafio_final.steps;

import desafio_final.pages.*;
import desafio_final.utils.DriveManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class DesafioTests {

    private WebDriver navegador;
    private HomePage homePage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private ProductPage productPage;

    @Before
    public void setUp() {
        // Inicializa o navegador usando o DriveManager
        navegador = DriveManager.getDriver();

        // Inicializa as páginas
        homePage = new HomePage(navegador);
        cartPage = new CartPage(navegador);
        checkoutPage = new CheckoutPage(navegador);
        productPage = new ProductPage(navegador);
    }
    @Dado("que estou na página inicial")
    public void queEstouNaPaginaInicial() {
        navegador.get("https://www.demoblaze.com/index.html");
    }
    @E("que clico no link de Monitores")
    public void queClicoNoLinkDeMonitores() {
        homePage.abrirPaginaMonitores();
    }
    @E("clico em um monitor da lista")
    public void clicoEmUmMonitorDaLista() {
        productPage.abrirMonitorAsus();
    }
    @E("adiciono o item no carrinho")
    public void adicionoOItemNoCarrinho() {
        productPage.addToCart();
    }
    @Quando("acesso o menu carrinho")
    public void acessoOMenuCarrinho() {
        cartPage.abrirCarrinho();
    }
    @E("finalizo o pedido")
    public void finalizoOPedido() {
        cartPage.preencherOrder("Teste", "Brasil", "POA", "123456", "May", 2024);
        cartPage.enviar();
    }
    @Entao("o pedido deve ser finalizado com sucesso")
    public void oPedidoDeveSerFinalizadoComSucesso() {
        String mensagemSucesso = checkoutPage.sucesso();
        assert mensagemSucesso.equals("Thank you for your purchase!") :
                "Mensagem de sucesso não corresponde! Esperado: 'Thank you for your purchase!'";

    }
    @After
    public void tearDown() {
        DriveManager.quitDriver();
    }


}
