package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

import static support.Utils.esperarElementoEstarPresente;


public class LoginPage extends RunCucumberTest {

    //WebDriver driver;
    private final By btn_cadastrar_login = By.xpath("//i[@class='fa fa-lock']");
    private final By btn_confirmar_cadastro = By.id("btnRegister");


    //public LoginPage(WebDriver driver) {
    //    this.driver = driver;
    //}

    public void acessarTelaLogin() {
        getDriver().get("https://automationpratice.com.br/");
        Utils.esperarElementoEstarPresente(btn_cadastrar_login, 10);
    }

    public void clickBtnCadastrarLogin(){
        getDriver().findElement(btn_cadastrar_login).click();
        Utils.esperarElementoEstarPresente(btn_confirmar_cadastro, 10);
    }

}
