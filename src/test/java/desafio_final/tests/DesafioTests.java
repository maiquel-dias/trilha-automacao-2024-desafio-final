package desafio_final.tests;

import desafio_final.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Desafio final de Automação de testes com Selenium")
public class DesafioTests {

    private WebDriver navegador;

    @BeforeEach
    public void setUp(){
        // Abrir o navegador Chrome
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    @DisplayName("Compra com sucesso no site demoblaze.com")
    public void testCompraMonitor() {

       String pegarAOrdem = new HomePage(navegador)
                .acessarPaginaHome()
                .abrirPaginaMonitores()
                .abrirMonitorAsus()
                .addToCart()
                .abrirCarrinho()
                .preencherOrder("Teste", "Brasil", "POA", "123456", "May", 2024)
                .enviar()
                .sucesso();

        Assertions.assertEquals("Thank you for your purchase!", pegarAOrdem);

    }
    @AfterEach
    public void tearDown(){
        navegador.quit();

    }
}
