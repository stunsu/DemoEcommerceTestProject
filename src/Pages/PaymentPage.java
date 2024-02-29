package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    public static void completePayment(WebDriver driver) throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".opc-block-summary")));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".action.primary.checkout")));
        WebElement confirmPayment = driver.findElement(By.cssSelector(".action.primary.checkout"));
        confirmPayment.click();
    }
}
