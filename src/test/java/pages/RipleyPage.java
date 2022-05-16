package pages;

public class RipleyPage extends BasePage{

    private String btnCosePublicity = "//button[@class=\"home-mkt-popup-button-element active\"]";
    private String inputCriteria = "//input[@type=\"search\"]";
    private String btnBusqueda = "//button[@class=\"search-bar-search-term\"]";
    private String selectRelevancia = "//div/div/div/div/select[@name=\"algolia-order-by\"]";


    public RipleyPage() {
        super(driver);
    }

    public void navigateToRipley(){

        navigateTo("https://simple.ripley.cl/");
    }

    public void maximizePageRipley(){
        maximizePage();
    }

    public String getTitlePageRipley(){
        return getTitlePage();
    }

    public String getURLPageRipley(){
        return getURLPage();
    }

    public void clickClosePublicity(){
        clickOnElement(btnCosePublicity);
    }

    public void enterSearchCriteria(String criteria){
        write(inputCriteria,criteria);
    }

    public void clickSearch(){
        clickOnElement(btnBusqueda);
    }

    public void selectPreferencia(String value)  {
        selectFromDropByValue(selectRelevancia, value);
    }

}
