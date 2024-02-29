package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductSelection {
    public static void clickOnAProductFromListing(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".column.main")));
        WebElement productSelector = driver.findElement(By.cssSelector("a[title='Radiant Tee']"));  //using css selector by tag a and input
        productSelector.click();
    }
}
