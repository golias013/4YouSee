package Function;

import FourYouSee.BaseTest;
import Pages.LoginPage;
import FourYouSee.Utils;
import io.cucumber.java.en.And;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginFunction extends BaseTest{
    private LoginPage loginPage;
    private Utils utils;

    public LoginFunction(){
        this.loginPage = new LoginPage(driver);
        this.utils = new Utils();
    }
    public void abrirNavegador(){driver.get(url);}

    public void preencherLoginPage(){
        if (this.loginPage.getCampoUsuario().isEnabled()){
            System.out.println("Campo de usuario encontrado");
            this.utils.preencheCampoTexto(this.loginPage.getCampoUsuario(),"victorsoaresb");
            System.out.println("Campo de usuario preenchido");
        }
        else {
            System.out.println("Campo de usuario não encontrado");
        }
        if (this.loginPage.getCampoSenha().isEnabled()) {
            System.out.println("Campo de senha encontrado");
            this.utils.preencheCampoTexto(this.loginPage.getCampoSenha(),"kbXR8w6kw97L5N");
            System.out.println("Campo de senha preenchido");
        }
        else{
            System.out.println("Campo de senha não encontrado");
        }
    }
    public void clicarNoBotaoEnviar(){
        if (this.loginPage.getEnviar().isEnabled()){
            System.out.println("Botão enviar encontrado");
            this.loginPage.getEnviar().click();
            System.out.println("Botão enviar clicado");
        }
        else{
            System.out.println("Botão enviar não encontrado");
        }
    }
    public String validarProximaPagina(){
        return driver.findElement(By.xpath("//div[@class=\"user-action\"]")).getText();
    }
}


