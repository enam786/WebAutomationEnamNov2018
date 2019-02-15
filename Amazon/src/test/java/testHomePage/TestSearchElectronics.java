package testHomePage;

import homePage.SearchElectronics;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchElectronics extends SearchElectronics {
    SearchElectronics searchElectronics;
    @Test
    public void testSearchDoctorsBySubmitButton()throws IOException {
        searchElectronics = PageFactory.initElements(driver, SearchElectronics.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchElectronics.searchDoctorsBySubmitButton();
    }
    @Test
    public void testSearchDoctorsByENTERKeyword() throws IOException, InterruptedException {
        searchElectronics = PageFactory.initElements(driver, SearchElectronics.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchElectronics.searchDoctorsByENTERKeyword();
    }
}
