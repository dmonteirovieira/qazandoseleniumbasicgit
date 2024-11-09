package support;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public static void esperarElementoEstarPresente(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getRandomEmail() {
        String email_init = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();

        int minimo = 1;
        int maximo = 99999999;

        int resultado = random.nextInt(maximo-minimo)+minimo;

        return email_init + resultado + email_final;
    }

    public static String getRandomSenha() {
        String senha = "Qazando@";

        Random random = new Random();

        int minimo = 1;
        int maximo = 99999999;

        int resultado = random.nextInt(maximo-minimo)+minimo;

        return senha + resultado;
    }

    public static String getRandomName() {
        String nome_init = "Jose ";
        String nome_final = " de Abreu";

        Random random = new Random();

        int minimo = 1;
        int maximo = 99999999;

        int resultado = random.nextInt(maximo-minimo)+minimo;

        return nome_init + resultado + nome_final;
    }
}
