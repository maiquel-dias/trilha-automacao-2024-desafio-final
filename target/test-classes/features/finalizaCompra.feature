#language: pt

@Global
Funcionalidade: Adicionar monitor ao carrinho e finalizar compra
  Como cliente
  Eu quero adicionar um monitor ao carrinho
  Para concluir minha compra com sucesso

  @Cenario1

  Cenario: Realizar compra
    Dado que estou na página inicial
    E que clico no link de Monitores
    E clico em um monitor da lista
    E adiciono o item no carrinho
    Quando acesso o menu carrinho
    E finalizo o pedido
    Entao o pedido deve ser finalizado com sucesso
