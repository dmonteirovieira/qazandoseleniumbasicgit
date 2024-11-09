package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^Que o usuário está na tela de login$")
    public void que_o_usuário_está_na_tela_de_login() {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() {
        loginPage.clickBtnCadastrarLogin();
    }

}
