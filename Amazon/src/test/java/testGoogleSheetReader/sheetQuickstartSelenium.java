package testGoogleSheetReader;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


/* To read a single range of data out of a spreadsheet, use a spreadsheets.values.get request:

  //ValueRange result = service.spreadsheets().values().get(spreadsheetId, range).execute();
  //int numRows = result.getValues() != null ? result.getValues().size() : 0;
 // System.out.printf("%d rows retrieved.", numRows);

 */

/*To read multiple discontinuous ranges, use a
spreadsheets.values.batchGet, which lets you specify any number of ranges to retrieve:

*/

    public class sheetQuickstartSelenium  {
        private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
        private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
        private static final String TOKENS_DIRECTORY_PATH = "tokens";

        /**
         * Global instance of the scopes required by this quickstart.
         * If modifying these scopes, delete your previously saved tokens/ folder.
         */
        private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
        private static final String CREDENTIALS_FILE_PATH = "/client_id.json";

        /**
         * Creates an authorized Credential object.
         *
         * @param HTTP_TRANSPORT The network HTTP Transport.
         * @return An authorized Credential object.
         * @throws IOException If the credentials.json file cannot be found.
         */

        WebDriver driver;
        @BeforeMethod
        public void setup(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\ENAM\\Desktop\\Drivers\\Chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.amazon.com/");
        }




        private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
            // Load client secrets.
            InputStream in = testGoogleSheetReader.sheetQuickstartSelenium.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
            GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

            // Build flow and trigger user authorization request.
            GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                    HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES).setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH))).setAccessType("offline").build();
            LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
            return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
        }

        /**
         * Prints the names and majors of students in a sample spreadsheet:
         * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
         */
       @Test
        public  void demo() throws IOException, GeneralSecurityException {
            // Build a new authorized API client service.
            final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            final String spreadsheetId = "1W6_ZvOpi10VIzWi3tzFX5DixYSWpkQie1uDeG9111kE";
            final String range = "sheet1!A2:B2";
            // final String range = "sheet1";
            Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
            ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
            List<List<Object>> values = response.getValues();
            if (values == null || values.isEmpty()) {
                System.out.println("No data found.");
            } else {
                // System.out.println("Name, Major");

               // System.out.println(values);
                for (List row : values) {
                    // Print columns A and E, which correspond to indices 0 and 4.

                    System.out.printf("%s, %s\n", row.get(0), row.get(1));

                    driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
                    driver.findElement(By.cssSelector("#ap_email")).sendKeys(row.get(0).toString());
                    driver.findElement(By.cssSelector("#ap_password")).sendKeys(row.get(1).toString());
                    driver.findElement(By.cssSelector("#signInSubmit")).click();
                    driver.navigate().back();
                    driver.findElement(By.cssSelector("#ap_email")).clear();


                }
            }
        }

        @AfterMethod
        public void teardown(){
           if(driver != null) {
               driver.close();
           }
       }
    }




