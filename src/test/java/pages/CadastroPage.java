package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import runner.RunCucumberTest;
import support.Utils;

import static support.Utils.*;

public class CadastroPage extends RunCucumberTest {

    private final By campo_nome = By.id("user");
    private final By campo_email = By.id("email");
    private final By campo_senha = By.id("password");
    private final By btn_confirmar_cadastro = By.id("btnRegister");
    private final By elementoPopupConfirmacao = By.xpath("//h2[@id='swal2-title']");
    private final String mensagemOficialConfirmacao = "Cadastro realizado!";

    public void Cadastro() {
        Utils.esperarElementoEstarPresente(btn_confirmar_cadastro, 10);
        getDriver().findElement(campo_nome).sendKeys(getRandomName());
        getDriver().findElement(campo_email).sendKeys(getRandomEmail());
        getDriver().findElement(campo_senha).sendKeys(getRandomSenha());
    }

    public void clicarCadastrar() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(btn_confirmar_cadastro)).click().build().perform();
        //driver.findElement(btn_confirmar_cadastro).click();
    }

    public void validarMensagemConfirmacaoCadastro() {
        String mensagem = getDriver().findElement(elementoPopupConfirmacao).getText();
        System.out.println(mensagem);
        Assert.assertEquals(mensagemOficialConfirmacao, mensagem);
    }

}
