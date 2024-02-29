package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    public static void addToBasketFromPDP(WebDriver driver) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#option-label-size-143-item-166")));
        WebElement sizeSelector = driver.findElement(By.cssSelector("div#option-label-size-143-item-166"));
        sizeSelector.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[option-label='Blue']")));
        WebElement colorSelector = driver.findElement(By.cssSelector("div[option-label='Blue']"));
        colorSelector.click();

        WebElement addToBasket = driver.findElement(By.cssSelector(".action.primary.tocart"));
        addToBasket.click();

        Thread.sleep(5000);
        WebElement clickOnBasketIcon = driver.findElement(By.cssSelector(".action.showcart"));
        clickOnBasketIcon.click();

        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#top-cart-btn-checkout")));
        WebElement clickOnProceedToCheckout = driver.findElement(By.cssSelector("#top-cart-btn-checkout"));
        clickOnProceedToCheckout.click();

    }
}
