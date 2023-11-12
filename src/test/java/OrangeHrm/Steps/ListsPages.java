package OrangeHrm.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListsPages {

    private WebDriver driver;

    public ListsPages (WebDriver driver){

        this.driver = driver;
    }

    public void roleUsers(String typeRole){
        WebElement listRoles = driver.findElement(By.xpath("//*[text()= 'User Role']//..//..//i"));
        listRoles.click();

        WebElement selectRole = listRoles.findElement(By.xpath("//*[text()='"+typeRole+"']"));
        selectRole.click();
    }

    public void country(String typeCountry){
        WebElement listCountry = driver.findElement(By.xpath("//*[text()= 'Country']//..//..//i"));
        listCountry.click();

        WebElement selectCountry = listCountry.findElement(By.xpath("//*[text()='"+typeCountry+"']"));
        selectCountry.click();
    }
}
