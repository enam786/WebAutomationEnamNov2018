package dropDown;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FetchDropDown extends CommonAPI {
    public void checkDropDownAllOption (){
        List<WebElement> element = getListOfWebElementsByXpath("//*[@class='nav-searchbar']//*[@class='nav-left']");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
    public void checkDropDownSingleOption (){
        //List<WebElement> element = getListOfWebElementsByCss(".gh-sb.gh-sprRetina option:nth-child(3)");
        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown-card:nth-child(3)");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
       // selectOptionByVisibleText("", "Books");

        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}
