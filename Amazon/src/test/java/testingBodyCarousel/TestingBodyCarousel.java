package testingBodyCarousel;

import bodyCarousel.BodyCarousel;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestingBodyCarousel extends BodyCarousel {
    BodyCarousel bodyCarousel;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bodyCarousel = PageFactory.initElements(driver, BodyCarousel.class);
    }

    @Test
    public void testCarousel() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bodyCarousel.CheckCarousel();

    }
}
