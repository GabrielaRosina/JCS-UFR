package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.DemoQA;


public class DemoQASteps extends BasePage {

    DemoQA demoqa = new DemoQA();

    public DemoQASteps() {
        super(driver);
    }

    @Given("I am on the DemoQA Page")
    public void iAmOnTheDemoQAPage() {
        step = "Navego a la pagina DemoQA";
        demoqa.printStep();
        demoqa.navigateToDemoQA();
    }

    @And("maximizo la pagina")
    public void maximizoLaPagina() {
        step = "Maximino la pantalla";
        demoqa.printStep();
        demoqa.maximicepantalla();
    }

    @And("hago clic sobre el boton elemento")
    public void hagoClicSobreElBotonElemento() {
        step = "Se hace clic sobre el boton Elemento";
        demoqa.printStep();
        demoqa.clickOnBottonElement();
    }

    @And("hago clic sobre el boton WebTable")
    public void hagoClicSobreElBotonWebTable() {
        step = "Se hace clic sobre el boton Web Table";
        demoqa.printStep();
        demoqa.clickWebtables();
    }

    @And("obtengo algun valor de la tabla")
    public void obtengoAlgunValorDeLaTabla() {
        step = "Obtengo algun valor de la tabla";
        demoqa.printStep();
        String valor = demoqa.getValueFromGrilla(3,4);
        System.out.println(valor);
        //Assert.assertEquals("Vega", valor);
    }

    @And("hago clic en el boton Widgets")
    public void hagoClicEnElBotonWidgets() {
        step = "Se hace clic sobre el boton Widgets";
        demoqa.printStep();
        demoqa.clickBtnWidgets();
    }



    @And("hago clic en el boton Select Menu")
    public void hagoClicEnElBotonSelectMenu() {
        step = "Hago click sobre el boton Select Menu";
        demoqa.printStep();
        demoqa.clicSelectMenu();
    }

    @And("selecciono un valor de style")
    public void seleccionoUnValorDeStyle() {
        step = "Selecciono un valor de Style";
        demoqa.printStep();
        demoqa.selectStyle("2");
        demoqa.selectStyleIndex(9);
    }

    @And("selecciono el valor {string}")
    public void seleccionoElValor(String style) {
    //demoqa.selectStyleValue(style);
        demoqa.selectStyleText(style);
    }


    @And("hago clic sobre el boton de Select One")
    public void hagoClicSobreElBotonDeSelectOne() {
        step = "Se hace clic sobre el boton Select One";
        demoqa.printStep();
        demoqa.clickBtnSelectOne();
    }

    @And("hago clic sobre el boton Alerta Principal")
    public void hagoClicSobreElBotonAlertaPrincipal() {
        step = "Se hace clic sobre el boton principal de la alerta";
        demoqa.printStep();
        demoqa.clickBtnAlertPrincipal();
    }

    @And("hago clic sobre el boton Alerta Lateral")
    public void hagoClicSobreElBotonAlertaLateral() throws InterruptedException {
        step = "Se hace clic sobre el boton alerta lateral";
        demoqa.printStep();
        demoqa.clickBtnAlertLateral();
    }

    @And("hago clic sobre el boton de la alerta")
    public void hagoClicSobreElBotonDeLaAlerta() throws InterruptedException {
        step = "Se hace clic sobre el boton alerta";
        demoqa.printStep();
        demoqa.clickBtnAlert();
    }

    @And("acepto la alerta")
    public void aceptoLaAlerta() throws InterruptedException {
        step = "Se hace clic sobre el boton Aceptar Alerta";
        demoqa.printStep();
        demoqa.aceptarAlerta();
    }


//    @And("selecciono una opcion {string}")
//    public void seleccionoUnaOpcion(String opcion) throws InterruptedException {
//        demoqa.chooseOptionSelectOne(opcion);
//    }



}
