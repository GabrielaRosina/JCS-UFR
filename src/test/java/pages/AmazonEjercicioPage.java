package pages;

import org.openqa.selenium.WebDriver;

public class AmazonEjercicioPage extends BasePage{

    private String inputSearch = "//input[@id=\"twotabsearchtextbox\"]";
    private String btnSearch = "//input[@id=\"nav-search-submit-button\"]";
    private String thirdResult = "//div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a";
    private String btnAgregarCarro = "//input[@id=\"add-to-cart-button\"]";
    private String messageAddCart = "//div[2]/div/div[1]/div[1]/div[2]/div/span[contains(text(),'Agregado')]";
    private String resultList = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]";


    public AmazonEjercicioPage() {
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com/");
   }

   public void inputSearch(String criteria){
        write(inputSearch,criteria);

   }

   public void clickSearch(){
        clickOnElement(btnSearch);
   }

   public void goToPage(String pageNumber){
        goToLinkText(pageNumber);
   }

   public void clickThirdResult(){
        clickOnElement(thirdResult);
      //selectNthElementFromList(resultList);
   }

   public void addCart(){
        clickOnElement(btnAgregarCarro);
   }

   public String addedMessageAddCart(){
        return textFromElement(messageAddCart);
   }

}
