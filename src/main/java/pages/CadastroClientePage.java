package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastroClientePage extends BasePage{

    public CadastroClientePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "cadastro")
    private WebElement btnCadastro;

    @FindBy(id = "input1")
    private WebElement nomeCliente;
    @FindBy(id = "input2")
    private WebElement cpfCliente;
    @FindBy(id = "input3")
    private WebElement dataNascimentoCliente;
    @FindBy(id = "input4")
    private WebElement numCelularCliente;
    @FindBy(id = "input5")
    private WebElement emailCliente;

    @FindBy(id = "botaoEnviar")
    private WebElement btnEnviar;
    @FindBy(id = "botaoX")
    private WebElement btnX;

    public CadastroClientePage clicaEmCadastrar (){
        btnCadastro.click();
        return this;
    }

    public CadastroClientePage preencheInputNome (String nome){
        nomeCliente.sendKeys(nome);
        return this;
    }

    public CadastroClientePage preencheInputCpf (String cpf) {
        cpfCliente.sendKeys(cpf);
        return this;
    }

    public CadastroClientePage preencheInputData (String dataNascimento){
        dataNascimentoCliente.sendKeys(dataNascimento);
        return this;
    }

    public CadastroClientePage preencheInputNum (String numCelular) {
        numCelularCliente.sendKeys(numCelular);
        return this;
    }

    public CadastroClientePage preencheInputEmail (String email) {
        emailCliente.sendKeys(email);
        return this;
    }

    public CadastroClientePage clicaEmEnviar () {
        btnEnviar.click();
        return this;
    }

    public CadastroClientePage clicaEmX () {
        btnX.click();
        return this;
    }

    public String buscarResultadoCadastro(){
        return driver.getPageSource();
    }











}