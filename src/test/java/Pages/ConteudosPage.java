package Pages;

import FourYouSee.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConteudosPage extends BaseTest {
    public ConteudosPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//li[@class=\"edit\"]")
    private WebElement editarConteudo;
    @FindBy (xpath = "//li[@class=\"remove\"]")
    private WebElement removerConteudo;
    @FindBy (xpath = "//div[@class=\"user-action\"]")
    private WebElement menuUsuario;
    @FindBy(xpath = "//a[@id=\"add-content-link\"]")
    private WebElement adicionar;
    @FindBy(xpath = "//a[@class=\"btn btn-default\"]/child::i[@class=\"fa fa-list\"]")
    private WebElement listar;
    @FindBy(xpath = "//button[@class=\"btn btn-default btn-sm\"]/child::i[@class=\"fa fa-trash-o fa-lg\"]")
    private WebElement limparDados;
    @FindBy(xpath = "//input[@id=\"litdescricaoIns\"]")
    private WebElement campoNome;
    @FindBy(xpath = "//input[@name=\"Adicionar\"]")
    private WebElement adicionarElemento;
    @FindBy (xpath = "//button[@target=\"#content-upload-btn\"]")
    private WebElement uploadArquivo;
    @FindBy(xpath = "//button[@id=\"open-category-dialog-button\"]")
    private WebElement categoria;
    @FindBy (xpath = "//span[@class=\"dynatree-node dynatree-lastsib item_35 dynatree-exp-cl dynatree-ico-c\"]/child::span[@class=\"dynatree-checkbox\"]")
    private WebElement escolherCategoria;
    @FindBy (xpath = "//div[@class=\"bar-buttons\"]/child::button[@class=\"btn btn-green ng-binding\"]")
    private WebElement botaoOKCategoria;
    @FindBy (xpath = "//input[@class=\"ng-valid ng-empty ng-dirty ng-valid-parse ng-touched\"]")
    private WebElement checkboxDaMidia;
    @FindBy (xpath = "//a[@class=\"dynatree-title\"]/parent::span[@class=\"dynatree-node item_34 dynatree-exp-c dynatree-ico-c dynatree-active\"]")
    private WebElement textoCategoria;

    public WebElement getEditarConteudo(){return editarConteudo;}
    public WebElement getRemoverConteudo(){return removerConteudo;}
    public WebElement getMenuUsuario(){return menuUsuario;}
    public WebElement getAdicionar(){return adicionar;}
    public WebElement getListar(){return listar;}
    public WebElement getLimparDados(){return limparDados;}
    public WebElement getCampoNome(){return campoNome;}
    public WebElement getAdicionarElemento(){return adicionarElemento;}
    public WebElement getUploadArquivo(){return uploadArquivo;}
    public WebElement getCategoria(){return categoria;}
    public WebElement getEscolherCategoria(){return escolherCategoria;}
    public WebElement getBotaoOKCategoria(){return botaoOKCategoria;}
    public WebElement getCheckboxDaMidia(){return checkboxDaMidia;}
    public WebElement getTextoCategoria(){return textoCategoria;}
}
