package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    public static void checkHomepage(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Home Page",title);



    }
}
