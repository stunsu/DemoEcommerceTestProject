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

        WebElement lastName = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        lastName.sendKeys("Monsieur");


        WebElement streetAddress = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        streetAddress.sendKeys("Bucharest 20");

        WebElement cityName = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        cityName.sendKeys("Bucharest");


        Select countrySelector =new Select(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/select")));
        countrySelector.selectByVisibleText("Romania");

        Select stateSelector =new Select(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/select")));
        stateSelector.selectByVisibleText("Bihor");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input")));
        WebElement zipCode = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        zipCode.sendKeys("123456");

        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        phoneNumber.sendKeys("0733777888");

        WebElement clickOnUpdateButton = driver.findElement(By.cssSelector(".action.action-update"));
        clickOnUpdateButton.click();

        WebElement confirmPayment = driver.findElement(By.cssSelector(".action.primary.checkout"));
        confirmPayment.click();
}
}



//