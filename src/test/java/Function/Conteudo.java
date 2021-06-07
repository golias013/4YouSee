package Function;

import FourYouSee.BaseTest;
import FourYouSee.Utils;
import Pages.ConteudosPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class Conteudo extends BaseTest {
    private ConteudosPage conteudosPage;
    private Utils utils;

    public Conteudo(){
        this.conteudosPage = new ConteudosPage(driver);
        this.utils = new Utils();
    }
    public void adicionarMidia(){
        if(this.conteudosPage.getAdicionar().isEnabled()){
            System.out.println("o botão adicionar foi encontrado");
            this.conteudosPage.getAdicionar().click();
            System.out.println("o botão adicionar foi clicado");
        }
        else{
            System.out.println("botão não localizado");
        }
        if (this.conteudosPage.getCampoNome().isEnabled()){
            System.out.println("campo nome encontrado");
            this.utils.preencheCampoTexto(this.conteudosPage.getCampoNome(),"teste1");
            System.out.println("campo preenchido");
        }
        else{
            System.out.println("campo não localizado");
        }
        if (this.conteudosPage.getCategoria().isEnabled()){
            this.conteudosPage.getCategoria().click();
            System.out.println("Categoria clicada");
            wait.until(ExpectedConditions.elementToBeClickable(this.conteudosPage.getEscolherCategoria()));
            driver.findElement(By.xpath("//span[@class=\"dynatree-checkbox\"]/parent::span[@class=\"dynatree-node item_34 dynatree-exp-c dynatree-ico-c dynatree-active\"]")).click();
            System.out.println("Categoria escolhida");
            this.conteudosPage.getBotaoOKCategoria().click();
            System.out.println("Botão ok categoria clicado");
        }
        else{
            System.out.println("Botão categoria não selecionado");
        }
        if (this.conteudosPage.getUploadArquivo().isEnabled()){
            System.out.println("Botão upload encontrado");
            //this.conteudosPage.getUploadArquivo().click();
            //System.out.println("Botão de upload clicado");
            driver.findElement(By.xpath("//button[@target=\"#content-upload-btn\"]"))
                    .sendKeys("C:"+ File.separator+"musica_teste"
                            +File.separator+"fade-ncs-release.mp3");
            System.out.println("Arquivo carregado");
            this.conteudosPage.getCheckboxDaMidia().click();
            System.out.println("Checkbox da Midia selecionada");
        }
        else{
            System.out.println("Botão de upload não localizado");
        }

        if (this.conteudosPage.getAdicionarElemento().isEnabled()){
            System.out.println("Campo adicionar midia encontrado");
            this.conteudosPage.getAdicionarElemento().click();
            System.out.println("botão adicionar midia clicado");
        }
        else{
            System.out.println("botão adicionar midia não localizado");
        }
    }
    public void apagarMidias(){
        if (this.conteudosPage.getRemoverConteudo().isEnabled()){
            System.out.println("botão remover midia encontrado");
            this.conteudosPage.getRemoverConteudo().click();
            System.out.println("Botão remover midia clicado");
            driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
        }
        else{
            System.out.println("botão remover midia não localizado");
        }
    }
    public void editarMidia(){
        if (this.conteudosPage.getEditarConteudo().isEnabled()){
            System.out.println("Botão de editar encontrado");
            this.conteudosPage.getEditarConteudo().click();
            System.out.println("Botão de editar clicado");
            this.utils.preencheCampoTexto(this.conteudosPage.getCampoNome(),"teste_editado");
            System.out.println("edição realizada");
            this.conteudosPage.getAdicionarElemento().click();
        }
        else {
            System.out.println("Botão editar não encontrado");
        }

    }
    public void listarMidia(){
        if (this.conteudosPage.getListar().isEnabled()){
            System.out.println("Botão listar encontrado");
            this.conteudosPage.getListar().click();
            System.out.println("Botão listar foi clicado");
        }
        else{
            System.out.println("Botão listar não encontrado");
        }

    }
    public void limparDados(){
        if (this.conteudosPage.getLimparDados().isEnabled()){
            System.out.println("Botão limpar dados encontrado");
            this.conteudosPage.getLimparDados().click();
            System.out.println("Botão limpar dados clicado");
        }
        else{
            System.out.println("Botão não encontrado");
        }
    }
}
