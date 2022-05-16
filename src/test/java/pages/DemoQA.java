package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DemoQA extends BasePage {
    //Comentario
    private String btnElement = "//div/div[2]/div/div[1]/div/div[2]";
    private String btnWebTable = "//div[1]/div/ul/li[4][@id=\"item-3\"]";
    private String table1 = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]";
    private String btnWidgestPrincipal = "//div[4]/div/div[2]";
    private  String btnSelectMenu = "//div[4]/div/ul/li[9]";
    private String selectStyle = "//select[@id=\"oldSelectMenu\"]";
    private String btnSelectOne = "//div[4]/div/div/div/div[2]/div";
    private String btnAlertsPrincipal = "//div[2]/div/div[3]/div/div[2]";
    private String btnAlertLateral = "//div[3]/div/ul/li[2]";
    private String btnAlert = "//button[@id=\"alertButton\"]";


    public DemoQA() {
        super(driver);
    }

    public void navigateToDemoQA(){
        navigateTo("https://demoqa.com/");
    }

    public void maximicepantalla(){
        maximizePage();
    }

    public void clickOnBottonElement(){
        try {
            scroll();
            if (elementIsVisible(btnElement)) {
                clickOnElement(btnElement);
                System.out.println("Se encontro el elemento");
            } else {
                System.out.println("El elemento no se encontro");
            }
        } catch (NullPointerException | NoSuchElementException e) {
            System.out.println("No se encontro el elemento");
            e.printStackTrace();
        }
    }

    public void clickWebtables() {
        try {
            scroll();
            scroll();
            if (elementIsVisible(btnWebTable)) {
                clickOnElement(btnWebTable);
            } else {
                System.out.println("El elemento no se encontro");
            }
        } catch (NullPointerException | NoSuchElementException e) {
            System.out.println("No se encontro el elemento");
            e.printStackTrace();
        }
    }

    public String getValueFromGrilla(int row, int column) {
        String valor = null;
        try {
            scroll();
            if (elementIsVisible(table1)) {
                valor = getValueFromTableDinamic(table1, row, column);
            } else {
                System.out.println("No se encontro el elemento");
            }
        } catch (NullPointerException e) {
            System.out.println("No se encontro el elemento");
            e.printStackTrace();
        }
        return valor;
    }


   public void clickBtnAlertPrincipal() {
        try {
            scroll();
            if(elementIsVisible(btnAlertsPrincipal)) {
                clickOnElement(btnAlertsPrincipal);
            } else {
                System.out.println("No se encontro el elemento");
            }
        } catch (NullPointerException | NoSuchElementException e) {
            System.out.println("No se encontro el elemento");
            e.printStackTrace();
        }

   }

    public void clickBtnAlertLateral() throws InterruptedException {
        try {
            scroll();
            scroll();
            if(elementIsVisible(btnAlertLateral)) {
                clickOnElement(btnAlertLateral);
            } else {
                System.out.println("No se encontro el elemento");
            }
        } catch (NullPointerException | NoSuchElementException e) {
            System.out.println("No se encontro el elemento");
            e.printStackTrace();

        }
   }

   public void clickBtnAlert() throws InterruptedException {
        try {
            if(elementIsVisible(btnAlert)){
                clickOnElement(btnAlert);
            } else {
                System.out.println("No se encontro el elemento");
            }
        } catch (NullPointerException | NoSuchElementException e){
            System.out.println("No se encontro el elemento");
            e.printStackTrace();
        }
    }

    public void aceptarAlerta() throws InterruptedException {
            Thread.sleep(600);
            aceptAlert();
            System.out.println("Se acepta la alerta");

    }

    public void clickBtnWidgets() {
        try {
            scroll();
            if(elementIsVisible(btnWidgestPrincipal)) {
                clickOnElement(btnWidgestPrincipal);
            } else {
                System.out.println("No se encontro el elemento");
            }
        } catch (NoSuchElementException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("No se encontro el elemento");
        }
    }

    public void clicSelectMenu() {
        try {
            scroll();
            if(elementIsVisible(btnSelectMenu)) {
                clickOnElement(btnSelectMenu);
            } else {
                System.out.println("No se encontro el elemento");
            }
        } catch (NullPointerException | NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("No se encontro el elemento");
        }

    }

    public void selectStyle(String style){
        selectFromDropByValue(selectStyle, style);
    }

    public void selectStyleValue(String estilo){
        selectFromDropByValue(selectStyle,estilo);

    }

    public void selectStyleIndex(int valor){
        selectFromDropByIndex(selectStyle, valor);
    }

    public void selectStyleText(String text){
        selectFromDropByText(selectStyle,text);
    }

    public void clickBtnSelectOne(){
        clickOnElement(btnSelectOne);
    }






}
