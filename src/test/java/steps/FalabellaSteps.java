package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.FalabellaPage;

public class FalabellaSteps {

    FalabellaPage falabella = new FalabellaPage();

    @Given("I am on the Falabella Page")
    public void iAmOnTheFalabellaPage() {
        falabella.navigateToFalabella();
    }

    @And("obtengo el titulo de la pagina")
    public void obtengoElTituloDeLaPagina() {
        falabella.getTitlePageFalabella();
        Assert.assertEquals("Falabella.com | Todo lo que necesitas en un solo lugar", falabella.getTitlePageFalabella());
    }

    @And("cierro la ventana emergente")
    public void cierroLaVentanaEmergente() {
        falabella.cerrarVentanaEmergente();
    }
}
