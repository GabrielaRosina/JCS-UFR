package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage{

    private String input = "//input[@class=\"search\"]";
    private String lista = "name";

    public ListPage(){
        super(driver);
    }


    public void navigatoToPageList(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearch(String textBusqueda){
        try {
            write(input, textBusqueda);
        }catch (NoSuchElementException e){
            System.out.println("No se ha encontrado el elemento input" );
            e.printStackTrace();
        }

    }

    public List<String> getAllSearchResult () {
        List<String> stringsFromList = null;
        try {
                List<WebElement> list = bringMeAllElements(lista);
                stringsFromList = new ArrayList<String>();
                for (WebElement e : list) {
                    stringsFromList.add(e.getText());
                }
           // return stringsFromList;
        } catch (NoSuchElementException | NullPointerException e) {
            System.out.println("Se intento encontrar el elemento lista pero se produjo un error");
            e.printStackTrace();
        }
        return stringsFromList;
    }


}
