# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário
    Eu como um novo usuário do site
    Quero me cadastrar
    Para poder realizar uma compra

    @cadastro-sucesso
    Cenário: Registrar novo usuário com sucesso
      Dado Que o usuário está na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Então vejo a mensagem de confirmação de cadastro

    @cadastro-sucesso2
    Cenário: Registrar novo usuário com sucesso
      Dado Que o usuário está na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Então vejo a mensagem de confirmação de cadastro