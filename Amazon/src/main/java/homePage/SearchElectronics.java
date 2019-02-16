package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchElectronics extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInput;

    @FindBy(how = How.XPATH, using ="//*[@class='nav-searchbar']//*[@id='nav-search-submit-text']")
    public static WebElement submitButton;

    public WebElement getSearchInput() {
        return searchInput;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void searchFor(String value){
        getSearchInput().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButton().click();
    }
    public void clearInput(){ getSearchInput().clear();
    }

    public void searchDoctorsBySubmitButton()throws IOException {
        List<String> list = getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

    public void searchDoctorsByENTERKeyword()throws InterruptedException, IOException {
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInput().sendKeys(st, Keys.ENTER);
            getSearchInput().clear();
        }
    }

    public List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }
}
