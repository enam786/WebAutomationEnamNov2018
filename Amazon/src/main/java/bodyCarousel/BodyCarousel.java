package bodyCarousel;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BodyCarousel extends CommonAPI {

    public void CheckCarousel() {

        //This will get the number of items in the carousel

        // //*[@class='a-link-normal center-image aok-block']//ancestor::div[8]
        String selector = "//*[@id='Ja2LecLAJt-LH6jugsa3DQ']";
        List<WebElement> items = driver.findElements(By.xpath(selector));
         int count = items.size();
        ArrayList list1 = new ArrayList();
        String name;

        for (int i = 0; i< count; i++) {
            int index = i + 1;

            //This will get the name of each item in carousel
            name = driver.findElement(By.cssSelector(selector + "[" + index + "]")).getText();
            list1.add(name);
        }

        //Next we click on the arrow of the carousel
        driver.findElement(By.cssSelector("div[class^=a-carousel-col] a")).click();

        //Then we new items are loaded in the carousel following the click,
        //we get the names again

       // ArrayList nextItems = driver.findElements(By.cssSelector(selector));
        List<WebElement> nextItems = driver.findElements(By.cssSelector(selector));

        int nextCount = nextItems.size();
        ArrayList list2 = new ArrayList();
        String newName;

        for (int i = 0; i < nextCount; i++) {
            int index = i + 1;

            //This will get the name of each item in carousel
            newName = driver.findElement(By.cssSelector(selector + "[" + index + "]")).getText();
            list2.add(newName);
        }

        /*
        //Then we compare the two arrayLists are not the same
        ArrayList commonList = CollectionUtils.retainAll(list1, list2);

        Assert.assertTrue(commonList.size() == 0);
        */

        //Then we compare the two arrayLists are not the same
        Set<String> newSet = new HashSet<String>(list1);

        newSet.addAll(list2);
        List<String> newList = new ArrayList<String>(newSet);

        Assert.assertTrue(newSet.size() == 0);
    }
}
