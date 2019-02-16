package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchDepartments extends CommonAPI {
    @FindBy(how = How.CSS, using ="twotabsearchtextbox")
    private static WebElement searchField;
    @FindBy(how = How.XPATH, using ="//*[@class='nav-search-submit nav-sprite']")
    private static WebElement submitButton;

    public List<String> getDepartmentList(){
        List<String> departmentList = new ArrayList<String>();
        departmentList.add("Alexa Skills");
        departmentList.add("Amazon Fresh");
        departmentList.add("Amazon devices");
        departmentList.add("App and Games");
        departmentList.add("Books");
        return departmentList;
    }

    public static WebElement getSearchField() {
        return searchField;
    }
    public static void setSearchField(WebElement searchField) {
        SearchDepartments.searchField = searchField;
    }
    public static WebElement getSubmitButton() {
        return submitButton;
    }
    public static void setSubmitButton(WebElement submitButton) {
        SearchDepartments.submitButton = submitButton;
    }

    public void searchDepartmentBySubmitButton()throws IOException {
        List<String> departmentList = getDepartmentList();
        for(int i=0; i<departmentList.size(); i++) {
            getSearchField().sendKeys(departmentList.get(i));
            getSubmitButton().click();
            getSearchField().clear();
        }
    }
    public void searchDepartmentByENTERKeyword()throws InterruptedException, IOException {
        List<String> departmentList = getDepartmentList();
        for(String st: departmentList) {
            getSearchField().sendKeys(st, Keys.ENTER);
            getSearchField().clear();
        }
    }
}
