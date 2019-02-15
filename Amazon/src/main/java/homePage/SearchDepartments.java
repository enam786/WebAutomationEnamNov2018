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
    @FindBy(how = How.XPATH, using ="//a[@class='hidden-xs dropdown']//i[@class='fa fa-search']")
    private static WebElement searchKey;
    @FindBy(how = How.XPATH, using ="//div[@id='search-input-mega']//input[@name='q']")
    private static WebElement searchField;
    @FindBy(how = How.XPATH, using ="//div[@class='dropdown-menu mega-dropdown-menu search']//button[@class='btn btn-large']")
    private static WebElement submitButton;

    public List<String> getDepartmentList(){
        List<String> departmentList = new ArrayList<String>();
        departmentList.add("Cardiology");
        departmentList.add("Genetics");
        departmentList.add("Immunology");
        departmentList.add("Dentistry");
        departmentList.add("Opthalmology");
        return departmentList;
    }

    public static WebElement getSearchKey() {
        return searchKey;
    }

    public static void setSearchKey(WebElement searchKey) {
        SearchDepartments.searchKey = searchKey;
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

    public static void waitToBeVisible(){
        TestLogger.log(Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchKey.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchDepartmentBySubmitButton()throws IOException {
        List<String> departmentList = getDepartmentList();
        for(int i=0; i<departmentList.size(); i++) {
            //waitToBeVisible();
            getSearchKey().click();
            getSearchField().sendKeys(departmentList.get(i));
            getSubmitButton().click();
            //getSearchField().clear();
        }
    }
    public void searchDepartmentByENTERKeyword()throws InterruptedException, IOException {
        List<String> departmentList = getDepartmentList();
        for(String st: departmentList) {
            //waitToBeVisible();
            getSearchKey().click();
            getSearchField().sendKeys(st, Keys.ENTER);
            //getSearchField().clear();
        }
    }
}
