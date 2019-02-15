package googleSheetReader;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPIs.GoogleSheetReader.getSheetsService;


public class GoogleSheetPage extends CommonAPI {
    @FindBy(xpath = "//a[text()='MyChart']")
    public static WebElement myChart;
    @FindBy(xpath = "//form[@id='loginForm']//p[@class='input_treatment']")
    public static WebElement userName;
    @FindBy(xpath = "//input[@name='Password']")
    public static WebElement password;
    @FindBy(xpath = "//form[@id='loginForm']//button[@class='btn btn-large' ]")
    public static WebElement logInSubmitButton;

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> valueInColumn = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : valueInColumn) {
            Thread.sleep(3000);
            myChart.click();
            //userName.sendKeys(row.get(0).toString());
            inputValueInTextBoxByWebElement(userName, row.get(0).toString());
            //password.sendKeys(row.get(1).toString(),Keys.ENTER);
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.elementToBeClickable(logInSubmitButton));
            logInSubmitButton.click();
            //actual.add(getCurrentPageTitle());
            // actual.add(getTextByWebElement(errorMsg));
            //System.out.println(getTextByWebElement(errorMsg));
        }
        return actual;
    }

    //checking fileds are taking input or not //no need
    public void loginTest(String emailIn, String pass) throws Exception {
        Thread.sleep(3000);
        myChart.click();
        userName.sendKeys(emailIn);
        password.sendKeys(pass);
        logInSubmitButton.click();
    }

    public void inputValueInTextBoxByWebElement(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }

    public void clearInputBox(WebElement webElement) {
        webElement.clear();
    }

    public String getTextByWebElement(WebElement webElement) {
        String text = webElement.getText();
        return text;

    }
}
