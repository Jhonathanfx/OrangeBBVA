package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListsPages;
import OrangeHrm.Steps.Questions;
import net.serenitybdd.screenplay.actions.Clear;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyInfo {

    private ButtonPages buttonPages;
    private Questions questions;
    private ListsPages listsPages;

    @FindBy(how = How.XPATH, using = "//label[text()='Street 1']//..//..//input")
    private WebElement txtStreet1;

    @FindBy(how = How.XPATH, using = "//label[text()='City']//..//..//input")
    private WebElement txtCity;

    @FindBy(how = How.XPATH, using = "//label[text()='State/Province']//..//..//input")
    private WebElement txtState;

    public MyInfo(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        //this.questions = new Questions(driver);
        this.listsPages = new ListsPages(driver);

    }

    public void llegarMyInfo() {
        this.buttonPages.btnMyInfo();
        this.buttonPages.setBtnContactsDetails();
        //this.questions.timeSecond(2);
    }

    public void fillOutContactsDetails(String Street1, String City, String State) {
        txtStreet1.sendKeys(Street1);
        txtCity.sendKeys(City);
        txtState.sendKeys(State);
    }

    public void buscarCountry(String typeCountry) {
        this.listsPages.country(typeCountry);
        buttonPages.btnSave();
    }
}
