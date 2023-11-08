package OrangeHrm.Pages;

import OrangeHrm.Steps.ButtonPages;
import OrangeHrm.Steps.ListsPages;
import org.openqa.selenium.WebDriver;

public class AdminPages {
    private ButtonPages buttonPages;
    private ListsPages listsPages;

    public AdminPages(WebDriver driver) {
        this.buttonPages = new ButtonPages(driver);
        this.listsPages = new ListsPages(driver);
    }

    public void llegarAdmin() {
        this.buttonPages.btnAdmin();
    }
    public void buscarUsuario(String typeRole){
        this.listsPages.roleUsers(typeRole);
    }
}
