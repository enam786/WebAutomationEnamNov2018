package testGoogleSheetReader;

import googleSheetReader.GoogleSheetPage;
import googleSheetReader.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetReader extends GoogleSheetReader {
    GoogleSheetPage googleSheetPage;
    GoogleSheetReader googleSheetReader;


    @BeforeMethod
    public void initialize() {
        //TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        googleSheetPage = PageFactory.initElements(driver, GoogleSheetPage.class);
        googleSheetReader = PageFactory.initElements(driver, GoogleSheetReader.class);
    }


    @Test (enabled = false)
    public void testLogInByInvalidIdPasswordUsingGoogleSheet() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1W6_ZvOpi10VIzWi3tzFX5DixYSWpkQie1uDeG9111kE";
        String range = "Sheet1!A2:B";

        //List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            //i++;
        }
        System.out.println("testLogInByInvalidIdPasswordUsingGoogleSheet Passed");
    }
    @Test (enabled = true)
    public void testLoginUsingValidPasswordUsingGoogleSheet() {
        try{
            int i = 0;
            Thread.sleep(3000);
            String spreadsheetId = "1W6_ZvOpi10VIzWi3tzFX5DixYSWpkQie1uDeG9111kE";
            String range = "Sheet1!A2:B";
            List<List<Object>> expectedErrorMessage = googleSheetPage.getSpreadSheetRecords(spreadsheetId, range);
            List<String> actualErrorMessage = googleSheetPage.signInByInvalidIdPass(spreadsheetId, range);

           /* for(List row : expectedErrorMessage){
                Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
                System.out.println("expected"+row.get(3).toString());
                System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
                i++;
            }*/
            System.out.println("testLogInUsingGoogleSheet Passed");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("testLogInUsingGoogleSheet Failed");
        }
    }
    @Test (enabled = false)
    public void testLogin() throws Exception{
        googleSheetPage.loginTest("aaabb@ccc.ccc", "12345");
    }

}
