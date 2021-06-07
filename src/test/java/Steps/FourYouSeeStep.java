package Steps;

import FourYouSee.BaseTest;
import Function.Conteudo;
import Function.LoginFunction;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

public class FourYouSeeStep extends BaseTest {
    private LoginFunction loginFunction;
    private Conteudo conteudo;


    public FourYouSeeStep(){
        this.loginFunction = new LoginFunction();
        this.conteudo = new Conteudo();
    }

    @Before
    public void abrirNavegador(){driver.get(url);}

    //CT01 -Página de login
    @Given("Preencha os campos de usuario e senha")
    public void preencha_os_campos_de_usuario_e_senha() { this.loginFunction.preencherLoginPage();}

    @When("Clico no botão login")
    public void clico_no_botão_login() {
        this.loginFunction.clicarNoBotaoEnviar();
    }

    @Then("Valido que estou na proxima pagina")
    public void valido_que_estou_na_proxima_pagina() {
        this.loginFunction.validarProximaPagina();
    }

    //CT02 - Adicionando elementos na pagina
    @Given("Adicione uma midia para a conta")
    public void adicione_uma_midia_para_a_conta() {
        this.loginFunction.preencherLoginPage();
        this.loginFunction.clicarNoBotaoEnviar();
        this.loginFunction.validarProximaPagina();
        this.conteudo.adicionarMidia();
    }
    @When("Edite a midia adicionada")
    public void edite_a_midia_adicionada() {
       this.conteudo.editarMidia();
    }

    @Then("Apague a midia editada")
    public void apague_a_midia_editada() {
       this.conteudo.apagarMidias();
    }
}