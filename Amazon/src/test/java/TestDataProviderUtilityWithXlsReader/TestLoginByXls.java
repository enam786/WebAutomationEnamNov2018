package TestDataProviderUtilityWithXlsReader;

import dataProviderUtilityWithXlsReader.LogInByXls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;

public class TestLoginByXls extends LogInByXls {
    DataReader reader = new DataReader();

    LogInByXls logInByXls;

    @BeforeMethod
    public void initializePageObject() {
        logInByXls = PageFactory.initElements(driver, LogInByXls.class);
    }

    @Test(dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String email, String passCode) throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInByXls.signInByDataProvider(email,passCode);
        //String actual = homePage.errorMessage.getText();
        //Assert.assertEquals(actual,message);
    }

}
