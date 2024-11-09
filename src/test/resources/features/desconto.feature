# language: pt

@desconto
Funcionalidade: Receber desconto da qazando
  Eu como usuário da qazando
  quero receber o cupom de desconto
  paa comprar um curso com valor reduzido

  @gerar-cupom
  Cenário: Vizualizar codigo de desconto
    Dado que estou no site da qazando
    Quando o usuario preenche o campo email
    E clica em em ganhar cupom
    Então o usuario deve ver o codigo de desconto

  @test-falha
  Cenário: xpto
    Dado que eu tenho um cupom gerado