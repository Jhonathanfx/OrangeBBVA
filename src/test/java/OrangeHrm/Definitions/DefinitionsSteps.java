package OrangeHrm.Definitions;

import OrangeHrm.Pages.*;
import OrangeHrm.Pages.PimPage;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Clear;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;

import java.sql.SQLException;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private PimPage pimPage = new PimPage(driver);
    private AdminPages adminPages = new AdminPages(driver);
    private MyInfo myInfo = new MyInfo(driver);

    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();
    }

    @When("^the user fill out user (.*) and password (.*)$")
    public void fillOutlogin(String userName, String password) throws SQLException {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, password);
    }

    @When("^the user reaches to add employee$")
    public void llegarAddEmployee() {
        this.pimPage = new PimPage(driver);
        this.pimPage.llegarAddEmployee();
    }

    @When("^the user fill out first name (.*) middle name (.*) last name (.*)$")
    public void fillOutAddEmployee(String firstName, String middleName, String lastName) {
        this.pimPage = new PimPage(driver);
        this.pimPage.fillOutAddEmployee(firstName, middleName, lastName);
    }

    @When("^the user reaches to admin$")
    public void llegarAdmin() {
        this.adminPages = new AdminPages(driver);
        this.adminPages.llegarAdmin();
    }

    @When("^el usuario esta buscando users (.*)$")
    public void buscarUsuario(String typeRole) {
        this.adminPages = new AdminPages(driver);
        this.adminPages.buscarUsuario(typeRole);
    }

    @When("^the user reaches to MyInfo$")
    public void llegarMyInfo() {
        this.myInfo = new MyInfo(driver);
        this.myInfo.llegarMyInfo();
        }

    @When("^the user fill out Street1 (.*)$")
    public void fillOutContactsDetails (String Street1) {
        this.myInfo = new MyInfo(driver);
        this.myInfo.fillOutContactsDetails(Street1);
    }
}