package dataProviderUtilityWithXlsReader;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
public class LogInByXls extends CommonAPI {
    @FindBy(css = ".nav-action-inner ")
    public static WebElement signin;
    @FindBy(xpath = "#ap_email")
    public static WebElement userName;
    @FindBy(xpath = "#ap_password")
    public static WebElement passwordField;
    @FindBy(xpath = "#signInSubmit")
    public static WebElement logInSubmitButton;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
    public void signInByDataProvider(String email, String password) throws Exception{
        Thread.sleep(3000);
        signin.click();
        userName.sendKeys(email);
        passwordField.sendKeys(password);
        logInSubmitButton.click();
    }
}
