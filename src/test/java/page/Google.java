package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    WebElement txtBusqueda;

    @FindBy (xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    WebElement btcBusqueda;

    public Google (WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
    }

    public void ingresarbusqueda (String busqueda) {
         txtBusqueda.sendKeys(busqueda);
    }
    public void clickBtnBuscar () {
        btcBusqueda.click();
    }
}



