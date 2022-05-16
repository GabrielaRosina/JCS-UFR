package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.ListPage;

import java.util.List;

public class ListSteps {

    ListPage list = new ListPage();

    @Given("I am on the List Page")
    public void iAmOnTheListPage() {
     list.navigatoToPageList();
    }


    @And("ingreso el {string}")
    public void ingresoEl(String state) throws InterruptedException {
        Thread.sleep(600);
        list.enterSearch(state);
    }


    @And("puedo encontrar la {string} en la lista")
    public void puedoEncontrarLaEnLaLista(String city) {
        List<String> lista = list.getAllSearchResult();
        boolean textIsThere = lista.contains(city);

        if(textIsThere){
            System.out.println("The text is on the list: PASSED.");
        }else {
            System.out.println("The text is not  on the list: FAILED.");
        }

    }
}
