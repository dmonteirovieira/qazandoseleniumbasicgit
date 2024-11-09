package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

   CadastroPage cadastroPage = new CadastroPage();

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro() {
        cadastroPage.Cadastro();
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar(){
        cadastroPage.clicarCadastrar();
    }

    @Então("^vejo a mensagem de confirmação de cadastro$")
    public void vejo_a_mensagem_de_confirmação_de_cadastro() {
        cadastroPage.validarMensagemConfirmacaoCadastro();
    }
}
