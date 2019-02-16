package testHomePage;

import homePage.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearch extends Search {
    public String searchkeys = "Phones";

    Search search;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        search = PageFactory.initElements(driver, Search.class);
    }
    @Test
    public void testSearchWithEnter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        searchWithENTER(searchkeys);
    }
    @Test
    public void testSearchWithButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        searchUsingButton(searchkeys);
    }
}


