package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class Search extends CommonAPI {

//    @FindBy(xpath = "//a[@class='hidden-xs dropdown']//i[@class='fa fa-search']")
//    public static WebElement search;

    @FindBy(css = "#twotabsearchtextbox")
    public static WebElement searchField;

    @FindBy(xpath = "//*[@class='nav-searchbar']//*[@id='nav-search-submit-text']")
    public static WebElement searchButton;


   /* public static  void waitToBeVisible(){
        TestLogger.log(Search.class.getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        search.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    } */

    public void searchWithENTER(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        //waitToBeVisible();
        searchField.sendKeys(searchKeys, Keys.ENTER);
    }
    public void searchUsingButton(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        //waitToBeVisible();
        searchField.sendKeys(searchKeys);
        searchButton.click();
    }
}
