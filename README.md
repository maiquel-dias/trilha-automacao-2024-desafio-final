
# Projeto para automação de testes de uma aplicação web utilizando:
- **Selenium WebDriver** para automação do navegador.
- **Cucumber** para estruturação dos testes em BDD.
- **Page Objects e Page Factory** para organização do código.

## Estrutura do Projeto

- **features/**: Cenários de teste escritos em Gherkin.
- **pages/**: Definição de elementos e ações das páginas.
- **steps/**: Implementação dos passos dos cenários.
- **Runner.java**: Configuração de execução dos testes.

## Tecnologias

- **Java 11+**
- **Maven**
- **Selenium**
- **Cucumber**
- **JUnit**

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/maiquel-dias/trilha-automacao-2024-desafio-final.git
   ```
2. Execute os testes com Maven:
   ```bash
   mvn test
   ```

## Relatórios

Os relatórios serão gerados no diretório `reports/` nos formatos HTML, JSON e XML.

## Exemplo de Cenário

```gherkin
Funcionalidade: Finalizar compra

Cenário: Compra bem-sucedida
  Dado que estou na página inicial
  E clico no link de Monitores
  E seleciono um monitor
  E adiciono o item ao carrinho
  Quando finalizo o pedido
  Então vejo a mensagem de sucesso
```

## Contato

Para dúvidas ou sugestões, entre em contato via email (maiquel.dias@gmail.com) ou crie uma issue no repositório.
