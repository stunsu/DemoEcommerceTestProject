package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderConfirmationPage {
    public static void orderConfirmationMessage(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-ui-id='page-title-wrapper']")));

        WebElement orderSuccesfullMessage = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
        String txt = orderSuccesfullMessage.getText();
        System.out.println(txt);

        Assert.assertEquals("Thank you for your purchase!",txt);
}

}
