import bases.BasePi;
import pages.CadastroClientePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PiTest extends BasePi {
    @Test
    public void fazerCadastro(){
        CadastroClientePage page = new CadastroClientePage( getDriver() ) ;
        page.clicaEmCadastrar();
        page.preencheInputNome("Elias Machado");
        page.preencheInputCpf("884.123.510-77");
        page.preencheInputData("2003-12-01");
        page.preencheInputNum("519183213993");
        page.preencheInputEmail("eliasmac@gelo.com.br");
        page.clicaEmEnviar();
        page.clicaEmX();

    }
}
