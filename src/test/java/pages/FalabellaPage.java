package pages;

import org.openqa.selenium.WebDriver;

public class FalabellaPage extends BasePage{

    private String btnClose = "//div[@class=\"dy-lb-close\"]";

    public FalabellaPage() {
        super(driver);
    }

    public void navigateToFalabella(){
        navigateTo("https://www.falabella.com/falabella-cl");
    }

    public String getTitlePageFalabella(){
        return getTitlePage();
    }

    public void cerrarVentanaEmergente(){
        clickOnElement(btnClose);
    }

}
