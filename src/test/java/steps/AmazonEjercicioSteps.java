package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AmazonEjercicioPage;

public class AmazonEjercicioSteps {

    AmazonEjercicioPage amazon = new AmazonEjercicioPage();

    @Given("the user navigate to Amazon")
    public void theUserNavigateToWwwAmazonCom() {
          amazon.navigateToAmazon();
    }


    @And("^searches for (.+)$")
    public void searchesFor(String criteria) {
        amazon.inputSearch(criteria);
        amazon.clickSearch();
    }

    @And("^the navigates to the page number (.+)$")
    public void theNavigatesToThePageNumber(String pageNumber) {
        amazon.goToPage(pageNumber);
    }

    @When("selects the third item")
    public void selectsTheThirdItem() {
        amazon.clickThirdResult();
    }

    @Then("the user is able to add it to the cart")
    public void theUserIsAbleToAddItToTheCart() {
        amazon.addCart();
        amazon.addedMessageAddCart();
        Assert.assertEquals("Agregado al carrito",amazon.addedMessageAddCart());
    }
}
