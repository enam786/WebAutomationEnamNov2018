package testHomePage;

import helper.Helper;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends MainPage {

    MainPage mainPage;

    @BeforeMethod
    public void initialize() {
        logger();
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testMenu(){
        logger();
        mainPage.checkMenu();
    }
    @Test
    public void testLogo(){
        logger();
        mainPage.checkLogo();
    }
    @Test
    public void testAllKeyInSearch(){
        logger();
        mainPage.checkAllKeyInSearch();
    }
    @Test
    public void testSearchField(){
        logger();
        mainPage.CheckSearchField();
    }
    @Test
    public void testSearchPane() {
        logger();
        mainPage.checkSubmitButton();
    }
    @Test
    public void testValentine() {
        logger();
        mainPage.checkValentineGift();
    }
    @Test
    public void testDeliverTo() {
        logger();
        mainPage.checkDeliverTo();
    }
    @Test
    public void testYourAmazon() {
        logger();
        mainPage.checkYourAmazon();
    }
    @Test
    public void testTodaysDeal() {
        logger();
        mainPage.checkTodaysDeal();
    }
    @Test
    public void testGiftCards() {
        logger();
        mainPage.checkGiftCards();
    }
    @Test
    public void testWholeFoods() { // test can be failed due to absent of .window.maximize
        logger();
        mainPage.checkWholeFoods();
    }
    @Test
    public void testRegistry() {
        logger();
        mainPage.checkRegistry();
    }
    @Test
    public void testSell() {
        logger();
        mainPage.checkSell();
    }
    @Test
    public void testEN() {
        logger();
        mainPage.checkEN();
    }
    @Test
    public void testSignIn() {
        logger();
        mainPage.checkSignIn();
    }
    @Test
    public void testOrders() {
        logger();
        mainPage.checkOrders();
    }
    @Test
    public void testPrime() {
        logger();
        mainPage.checkPrime();
    }
    @Test
    public void testCart() {
        logger();
        mainPage.checkCart();
    }
    @Test
    public void testRecommendation() {
        logger();
        mainPage.checkRecommendation();
    }

    @Test
    public void testBackToTop() {
        logger();
        mainPage.checkBackToTop();
    }

    @Test
    public void testCareer() {
        logger();
        mainPage.checkCareers();
    }

    @Test
    public void testBlog() {
        logger();
        mainPage.checkBlog();
    }

    @Test
    public void testAboutAmazon() {
        logger();
        mainPage.checkAboutAmazon();
    }

    @Test
    public void testPress() {
        logger();
        mainPage.checkPress();
    }

    @Test
    public void testInvestorRelation() {
      logger();
        mainPage.checkInvestorRelation();
    }

    @Test
    public void testAmazonDevices() {
        logger();
        mainPage.checkAmazonDevices();
    }

    @Test
    public void testSellOnAmazon() {
        logger();
        mainPage.checkSellOnAmazon();
    }

    @Test
    public void testPrivateBrands() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkPrivateBrands();
    }

    @Test
    public void testAmazonHandmade() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkAmazonHandmade();
    }

    @Test
    public void testSellYourService() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSellYourService();
    }

    @Test
    public void testSeeAll() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSeeAll();
    }

    @Test
    public void testAmazonLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkAmazonLogo();
    }

    @Test
    public void testChooseLanguage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkChooseLanguage();
    }

    @Test
    public void testUsButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkUsButton();
    }

    @Test
    public void testAmazonMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkAmazonMusic();
    }

    @Test
    public void testAmazonWebService() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkAmazonWebService();
    }

    @Test
    public void testSecondChance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSecondChance();
    }

    @Test
    public void testConditionOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkConditionOfUse();
    }

    @Test
    public void testTakeALook() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkTakeALook();
    }
}

