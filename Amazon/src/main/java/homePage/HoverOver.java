package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class HoverOver extends CommonAPI {
    public void checkHelloSignin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement Signin = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Thread.sleep(2000);
        builder.moveToElement(Signin).build().perform();
        Thread.sleep(2000);
         // mouseHoverByCSS("#nav-link-accountList");
        System.out.println(Signin.getText());
    }
    public void checkListOfHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement aboutUs = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Thread.sleep(2000);
        builder.moveToElement(aboutUs).build().perform();
        Thread.sleep(2000);
        System.out.println(aboutUs.getText());
        //mouseHoverByCSS("#nav-link-accountList");

        //List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'About Us')]//following-sibling::div[@class='menu-content']//a")); // see elements!
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='nav-al-container']"));
        int totalCount = list.size();
        System.out.println(totalCount);
        for (int i =0; i < totalCount;i++){
            System.out.println(list.get(i).getText());
        }
    }

    public List<String> checkListOfHoverOverReturnMethod() throws InterruptedException {
        Actions builder = new Actions(driver);
        WebElement aboutUs = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Thread.sleep(2000);
        builder.moveToElement(aboutUs).build().perform();
        Thread.sleep(2000);
        //List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'About Us')]//following-sibling::div[@class='menu-content']//a"));
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='nav-al-container']"));

        List<String> stringList = new ArrayList<>();
        for (WebElement e:list) {
            stringList.add(e.getText());
            System.out.println(e.getText());
        }
        System.out.println(stringList);

        /*for(int i = 0; i<list.size();i++){        //for loop
        String se = list.get(i).getText();
        stringList.add(i,se);
        }*/

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Sign in");
        expectedList.add("New customer? Start here.");
        expectedList.add("Your Lists");
        expectedList.add("Create a List");
        expectedList.add("Find a List or Registry");
        expectedList.add("Find a Gift");
        expectedList.add("Save Items from the Web");
        expectedList.add("Wedding Registry");
        expectedList.add("Baby Registry");
        expectedList.add("Friends & Family Gifting");
        expectedList.add("AmazonSmile Charity Lists");
        expectedList.add("Pantry Lists");
        expectedList.add("Your HeartS");
        expectedList.add("Explore Idea List");
        expectedList.add("Explore Showroom");
        expectedList.add("Discover your Style");
        expectedList.add("Take the HomeStyle Quiz");
        Assert.assertEquals(stringList,expectedList);
        return stringList;
    }

}
