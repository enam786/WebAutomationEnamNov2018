package homePage;


import base.CommonAPI;
import helper.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import javax.xml.xpath.XPath;

public class MainPage extends CommonAPI{

    Helper logHelper;


    @FindBy(css = "#nav-hamburger-menu")
    public static WebElement menu;
    @FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
    public static WebElement logo;
    //@FindBy(xpath = "//*[@class='nav-searchbar']//*[@class='nav-left']")
    @FindBy(css = "#searchDropdownBox")
    public static WebElement allKeyInSearch;
    @FindBy(css = "#twotabsearchtextbox")
    public static WebElement searchField;
    @FindBy(xpath = "//*[@class='nav-searchbar']//*[@id='nav-search-submit-text']")
    public static WebElement submitButton;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[2]/div/div/a/img")
    public static WebElement valentineGift;
    @FindBy(xpath = "//span[@id='glow-ingress-line2']")
    public static WebElement deliverTo;
    @FindBy(xpath = "//a[text()='Your Amazon.com']")
    public static WebElement yourAmazon;
    @FindBy(css = "#nav-xshop>a:nth-of-type(2)") //using css nth child
    public static WebElement todaysDeal;
    @FindBy(xpath = "//a[text()='Gift Cards']")
    public static WebElement giftCards;
    @FindBy(css = "#nav-xshop>a:nth-of-type(4)")
    public static WebElement wholeFoods;
    @FindBy(css = "#nav-xshop>a:nth-of-type(5)")
    public static WebElement registry;
    @FindBy(xpath = "//*[@id='nav-xshop-container']//*[text()='Sell']")
    public static WebElement sell;
    @FindBy(css = ".icp-nav-language")
    public static WebElement EN;
    @FindBy(xpath = "//a[text()='Hello, Sign in']")
    public static WebElement signIn;
    @FindBy(xpath = "//*[text()='Orders']")
    public static WebElement Orders;
    @FindBy(css = "#nav-link-prime")
    public static WebElement prime;
    @FindBy(xpath = "//*[@class='nav-cart-count nav-cart-0']")
    public static WebElement cart;
    @FindBy(xpath = "//a[text()='Sign in to see personalized recommendations']")
    public static WebElement recommendation;
    @FindBy(css = ".navFooterBackToTopText")
    public static WebElement backToTop;
    @FindBy(xpath="//*[contains(@href,'amazon.jobs')]")
    public static WebElement careers;
    @FindBy(xpath = "//a[text()='Blog']")
    public static WebElement blog;
    @FindBy(xpath = "//a[text()='About Amazon']")
    public static WebElement aboutAmazon;
    @FindBy(xpath = "//a[text()='Press Center']")
    public static WebElement press;
    @FindBy(xpath = "//a[text()='Investor Relations']")
    public static WebElement investorRelation;
    @FindBy(xpath = "//a[text()='Amazon Devices' and @class='nav_a']")
    public static WebElement amazonDevices;
    @FindBy(xpath = "//div[@class='nav-logo-base nav-sprite']")
    public static WebElement sellOnAmazon;
    @FindBy(xpath = "//a[text()='Sell Under Private Brands']")
    public static WebElement privateBrands;
    @FindBy(xpath = "//a[text()='Sell on Amazon Handmade']")
    public static WebElement amazonHandmade;
    @FindBy(xpath = "//a[text()='Sell Your Services on Amazon']")
    public static WebElement sellYourService;
    @FindBy(xpath = "//a[text()='See all']")
    public static WebElement seeAll;
    @FindBy(xpath = "//div[@class='nav-logo-base nav-sprite']")
    public static WebElement amazonLogo;
    @FindBy(xpath = "//span[text()='English'and @class='icp-color-base']")
    public static WebElement chooseLanguage;
    //Espanol language
    //learn more
    @FindBy(xpath = "//span[text()='United States']")
    public static WebElement usButton;
    @FindBy(xpath = "//a[text()='Amazon Music']")
    public static WebElement amazonMusic;
    @FindBy(xpath = " //td[@class='navFooterDescItem']//a[text()='Amazon Web Services']")
    public static WebElement amazonWebService;
    //prime now
    @FindBy(xpath = "//a[text()='Amazon Second Chance']")
    public static WebElement secondChance;
    @FindBy(xpath = "//a[text()='Conditions of Use' and @class='nav_a']")
    public static WebElement conditionOfUse;
    @FindBy(xpath = "//div[@id='nav-upnav']")
    public static WebElement takeALook;

    //@FindBy(xpath = "//div[@id='nav-upnav']")
   // public static WebElement takeALook;






    //© 1996-2019, Amazon.com, Inc. or its affiliates (can we test text)


 //a[text()='Amazon Business']
 //td[@class='navFooterDescItem']//a[text()='PillPack']


    public void checkMenu(){
        logHelper.logger();
        menu.click();
       // System.out.println(menu.getText());
    }
    public void checkLogo() {
        logHelper.logger();
        logo.click();
    }
    public void checkAllKeyInSearch() {
        logHelper.logger();
        allKeyInSearch.click();
    }
    public void CheckSearchField() {
        logHelper.logger();
        searchField.sendKeys("Breitling Watch", Keys.TAB );
    }
    public void checkSubmitButton() {
        logHelper.logger();
        submitButton.click();
    }
    public void checkValentineGift() {
        logHelper.logger();
        valentineGift.click();
    }
    public void checkDeliverTo() {
        logHelper.logger();
        deliverTo.click();
    }
    public void checkYourAmazon() {
        logHelper.logger();
        yourAmazon.click();
    }
    public void checkTodaysDeal() {
        logHelper.logger();
        todaysDeal.click();
    }
    public void checkGiftCards() {
        logHelper.logger();
        giftCards.click();
    }
    public void checkWholeFoods() {
        logHelper.logger();
        wholeFoods.click();
    }
    public void checkRegistry() {
        logHelper.logger();
        registry.click();
    }
    public void checkSell() {
        logHelper.logger();
        sell.click();
    }
    public void checkEN() {
        logHelper.logger();
        EN.click();
    }
    public void checkSignIn() {
        logHelper.logger();
        signIn.click();
    }
    public void checkOrders() {
        logHelper.logger();
        Orders.click();
    }
    public void checkPrime() {
        logHelper.logger();
        prime.click();
    }
    public void checkCart() {
        logHelper.logger();
        cart.click();
        String str = cart.getText();
        System.out.println(str);
    }
    public void checkRecommendation() {
        logHelper.logger();
        recommendation.click();
    }
    public void checkBackToTop() {
        logHelper.logger();
        backToTop.click();
    }
    public void checkCareers() {
        logHelper.logger();
        careers.click();
    }
    public void checkBlog() {
        logHelper.logger();
        blog.click();
    }
    public void checkAboutAmazon() {
        logHelper.logger();
        aboutAmazon.click();
    }
    public void checkPress() {

        logHelper.logger();
        press.click();
    }
    public void checkInvestorRelation() {
        logHelper.logger();
        investorRelation.click();
    }
    public void checkAmazonDevices() {
        logHelper.logger();
        amazonDevices.click();
    }
    public void checkSellOnAmazon() {
        logHelper.logger();
        sellOnAmazon.click();
    }
    public void checkPrivateBrands() {
        logHelper.logger();
        privateBrands.click();
    }
    public void checkAmazonHandmade() {
        logHelper.logger();
        amazonHandmade.click();
    }
    public void checkSellYourService() {
        logHelper.logger();
        sellYourService.click();
    }
    public void checkSeeAll() {
        logHelper.logger();
        seeAll.click();
    }
    public void checkAmazonLogo() {
        logHelper.logger();
        amazonLogo.click();
    }
    public void checkChooseLanguage() {
        logHelper.logger();
        chooseLanguage.click();
    }
    public void checkUsButton() {
        logHelper.logger();
        usButton.click();
    }
    public void checkAmazonMusic() {
        logHelper.logger();
        amazonMusic.click();
    }
    public void checkAmazonWebService() {
        logHelper.logger();
        amazonWebService.click();
    }
    public void checkSecondChance() {
        logHelper.logger();
        secondChance.click();
    }
    public void checkConditionOfUse() {
        logHelper.logger();
        conditionOfUse.click();
    }
    public void checkTakeALook() {
        logHelper.logger();
        takeALook.click();
    }


//    public void checkhelp() {
//        helper.logger();
//
//        takeALook.click();
//        typeOnElement("XPath", "//span[@id='glow-ingress-line2']");
//    }







}