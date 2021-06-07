package Pages;

import FourYouSee.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    public LoginPage(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@class=\"form-control\"][@placeholder=\"Usuário\"]")
    private WebElement campoUsuario;
    @FindBy(xpath = "//input[@class=\"form-control\"][@placeholder=\"Senha\"]")
    private WebElement campoSenha;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement enviar;

    public WebElement getCampoUsuario(){return campoUsuario;}
    public WebElement getCampoSenha(){return campoSenha;}
    public WebElement getEnviar(){return enviar;}
}
