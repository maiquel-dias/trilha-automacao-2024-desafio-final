#language: pt

@Global
Funcionalidade: Adiciona monitor no carrinho e finaliza compra
  Contexto:
    Dado que estou na pagina inicial

  @Cenario1
  Cenario: Acesso a categoria de monitores, adiciono um item no carrinho e finalizo a compra
    Dado que clico no link de Monitores
    E clico em um monitor da lista
    E adiciono o item no carrinho
    Quando acesso o menu card
    E finalizo o pedido
    Então o pedido deve ser finalizado com sucesso