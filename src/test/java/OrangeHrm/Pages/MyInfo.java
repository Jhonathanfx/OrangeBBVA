package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import net.serenitybdd.screenplay.actions.Clear;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyInfo {

    private ButtonPages buttonPages;

    @FindBy(how = How.XPATH, using = "//label[text()='Street 1']//..//..//input")
    private WebElement txtStreet1;

    @FindBy(how = How.XPATH, using = "//label[text()='City']//..//..//input")
    private WebElement txtCity;

    @FindBy(how = How.XPATH, using = "//label[text()='State/Province']//..//..//input")
    private WebElement txtState;

    public MyInfo(WebDriver driver) {
        this.buttonPages = new ButtonPages(driver);

        PageFactory.initElements(driver,this);
    }

    public void llegarMyInfo() {
        this.buttonPages.btnMyInfo();
        this.buttonPages.setBtnContactsDetails();

    }

    public void fillOutContactsDetails(String Street1) {
        txtStreet1.sendKeys(Street1);
        //txtCity.sendKeys(City);
        //txtState.sendKeys(State);
    }
}
