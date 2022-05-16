package pages;

import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected static WebDriver driver;
    private static Actions action;
    public static String step;
    WebDriverWait wait = new WebDriverWait(driver, 10);

    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);

    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
       // wait = new WebDriverWait(driver, 10);
    }

    //Funcion que me devuelve un WebElement, espera hasta que el elemento sea visible
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public void maximizePage(){
        driver.manage().window().maximize();
    }

    public static void closeBrowser(){
        driver.quit();
    }

    //obtengo titulo de la pagina
    public String getTitlePage(){
        return driver.getTitle();
    }

    //obtengo url de la pagina
    public String getURLPage(){
        return driver.getCurrentUrl();
    }

    //Acciones sobre los elementos
    public void clickOnElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String textToCriteria){
        Find(locator).clear();
        Find(locator).sendKeys(textToCriteria);
    }

    public void goToLinkText(String linktext){
        driver.findElement(By.linkText(linktext)).click();
    }

    //Manejador de Select por Index
    public void selectFromDropByIndex(String locator, int index){
        Select dropDown = new Select(Find(locator));
        dropDown.selectByIndex(index);

    }

    //selecciona un elemento de una lista, pasarle el locator comun a todos los elementos
    public void selectNthElementFromList(String locator){//, int index){
        List<WebElement> list = driver.findElements(By.xpath(locator));
        //list.get(index).click();
    }


    //Manejador de Select por Valor
    public void selectFromDropByValue(String locator, String value){
        Select dropDown = new Select(Find(locator));
        dropDown.selectByValue(value);

    }

    //Manejador de Select por texto visible
    public void selectFromDropByText(String locator, String valueToSelect){
        Select dropDown = new Select(Find(locator));
        dropDown.selectByVisibleText(valueToSelect);

    }

    //Acciones  con el action
    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }

    //Obtener valores de una tabla estatica
    public String getValueFromTable(String locator,int row, int column){
        String cellINedd = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return Find(cellINedd).getText();
    }

    //ingresar valores a una tabla estatica
    public void setValueOnTable(String locator, int row, int column, String StringToSend){
        String cellToFill = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        Find(cellToFill).sendKeys(StringToSend);
    }


   public void scroll() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
    }


    public String getValueFromTableDinamic(String locator,int row, int column){
        String cellINedd = locator+"/div["+row+"]/div/div["+column+"]";
        return Find(cellINedd).getText();
    }

    //revisar-No lo use Clic con java script
    public void clickJavaScript(String locator){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", Find(locator));
    }

    //Cerrar una alerta
    public void dismissAlert() {
        try{
            driver.switchTo().alert().dismiss();
        }catch(NoAlertPresentException e){
            e.printStackTrace();
        }
    }

    //Aceptar una alerta
    public void aceptAlert() {
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }

    //buscar el iframe segun el index
    public void switchToiFrame(int iFrameIndex){
        driver.switchTo().frame(iFrameIndex);
    }

    //volver al iframePadre
    public void switchToiFrame(){
        driver.switchTo().parentFrame();
    }

    //obtengo el texto de un elemento
   public String textFromElement(String locator){
        return Find(locator).getText();
   }

   public boolean elementIsVisible(String locator){
        return Find(locator).isDisplayed();
   }

   public boolean elementIsSelect(String locator){
        return Find(locator).isSelected();
   }

    public boolean elementIsActive(String locator){
        return Find(locator).isEnabled();
    }

    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    public static void printStep(){
        System.out.println("* Step: '" + step + "'.");
    }

    }





