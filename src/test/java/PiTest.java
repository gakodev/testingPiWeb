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
        page.preencheInputCpf("88412351077");
        page.preencheInputData("2003-12-01");
        page.preencheInputNum("519183213993");
        page.preencheInputEmail("eliasmac@gelo.com.br");
        page.clicaEmEnviar();
        page.clicaEmX();

        String resultadoFinal = page.buscarResultadoCadastro();
        System.out.println(resultadoFinal);
        Assert.assertTrue(resultadoFinal.contains("Fuga"));
    ///    Assert.assertTrue(resultadoFinal.contains("CPF: 88412351077"));
    ///    Assert.assertTrue(resultadoFinal.contains("Data de nascimento: 2003-12-01 "));
    //    Assert.assertTrue(resultadoFinal.contains("Numéro de celular: 519183213993"));
    //    Assert.assertTrue(resultadoFinal.contains("E-mail: eliasmac@gelo.com.br"));

    }
}
