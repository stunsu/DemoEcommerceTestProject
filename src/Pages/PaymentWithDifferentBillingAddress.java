package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentWithDifferentBillingAddress {

    public static void payWithDifferentBillingAddress(WebDriver driver) throws InterruptedException{


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".checkout-billing-address")));
        //Thread.sleep(2000);
        WebElement selectDifferentBilling = driver.findElement(By.cssSelector("#billing-address-same-as-shipping-checkmo"));
        selectDifferentBilling.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement firstName = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        firstName.sendKeys("Sorin");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='lastname']:nth-child(2)")));
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']:nth-child(2)"));
        lastName.sendKeys("Monsieur");


        WebElement streetAddress = driver.findElement(By.cssSelector("input[name='street[0]']:nth-child(2)"));
        streetAddress.sendKeys("Bucharest 20");

        WebElement cityName = driver.findElement(By.cssSelector("input[name='city']:nth-child(2)"));
        cityName.sendKeys("Bucharest");


        Select countrySelector =new Select(driver.findElement(By.cssSelector(".select[name='country_id']:nth-child(2)")));
        countrySelector.selectByVisibleText("Romania");

        Select stateSelector =new Select(driver.findElement(By.cssSelector(".select[name='region_id']:nth-child(2)")));
        stateSelector.selectByVisibleText("Bihor");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='postcode']:nth-child(2)")));
        WebElement zipCode = driver.findElement(By.cssSelector("input[name='postcode']"));
        zipCode.sendKeys("123456");

        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='telephone']:nth-child(2)"));
        phoneNumber.sendKeys("0733777888");

        WebElement clickOnUpdateButton = driver.findElement(By.cssSelector(".action.action-update"));
        clickOnUpdateButton.click();

        WebElement confirmPayment = driver.findElement(By.cssSelector(".action.primary.checkout"));
        confirmPayment.click();
}
}



//