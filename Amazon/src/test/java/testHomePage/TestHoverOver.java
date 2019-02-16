package testHomePage;

import homePage.HoverOver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHoverOver extends HoverOver {
    HoverOver hoverOver;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver = PageFactory.initElements(driver, HoverOver.class);
    }
    @Test(enabled = true, priority = 3)
    public void testAboutUs () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkHelloSignin();
    }
    @Test(enabled = true, priority = 2)
    public void testListOfHoverOver() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkListOfHoverOver();
    }
    @Test(enabled=true, priority = 1)
    public void testListOfHoverOverReturnMethod() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        hoverOver.checkListOfHoverOverReturnMethod();
    }
}
