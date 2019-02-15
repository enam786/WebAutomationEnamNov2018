package dataProviderUtilityWithXlsReader;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
public class LogInByXls extends CommonAPI {
    @FindBy(xpath = "//a[text()='MyChart']")
    public static WebElement myChart;
    @FindBy(xpath = "//form[@id='loginForm']//p[@class='input_treatment']")
    public static WebElement userName;
    @FindBy(xpath = "//input[@name='Password']")
    public static WebElement passwordField;
    @FindBy(xpath = "//form[@id='loginForm']//button[@class='btn btn-large' ]")
    public static WebElement logInSubmitButton;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
    public void signInByDataProvider(String email, String password) throws Exception{
        Thread.sleep(3000);
        myChart.click();
        userName.sendKeys(email);
        passwordField.sendKeys(password);
        logInSubmitButton.click();
    }
}
