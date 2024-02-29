package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ListingPage {
    public static void clickOnACategoryElement(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#ui-id-4")));
        WebElement categorySelector = driver.findElement(By.cssSelector("a#ui-id-4"));  //using css selector by tag a and id
        categorySelector.click();







    }
}
