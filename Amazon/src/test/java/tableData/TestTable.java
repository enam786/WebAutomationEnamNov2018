package tableData;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestTable extends CommonAPI {
    @Test
    public void readTable(){
        String table = getTextByCss(".navFooterMoreOnAmazon");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(table);
    }
    @Test
    public void readAnyRowOfTable(){
        String row = getTextByCss(".navFooterMoreOnAmazon tr:nth-child(3)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(row);
    }
    @Test
    public void readCellOfAnyRowOfATable(){
        String cell = getTextByCss(".navFooterMoreOnAmazon tr:nth-child(3) td:nth-child(3)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cell);
    }
    @Test
    public void readAllRowOfTable(){
        List<WebElement> listOfWebElement=getListOfWebElementsByCss(".navFooterMoreOnAmazon tr");
        List<String>rows = getListOfString(listOfWebElement);
        for(String st: rows){
            System.out.println(st);
        }
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(rows);
    }

}
