package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShippingPage {
    public static void checkShippingPage(WebDriver driver) throws InterruptedException {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Checkout",title);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer-email\"]")));
        WebElement customerEmail = driver.findElement(By.xpath("//*[@id=\"customer-email\"]"));
        customerEmail.sendKeys("sorry197@yahoo.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='firstname']")));
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Sorin");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='lastname']")));
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Monsieur");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='firstname']")));
        WebElement streetAddress = driver.findElement(By.cssSelector("input[name='street[0]']"));
        streetAddress.sendKeys("Bucharest 18");

        WebElement cityName = driver.findElement(By.cssSelector("input[name='city']"));
        cityName.sendKeys("Bucharest");


        Select countrySelector =new Select(driver.findElement(By.cssSelector(".select[name='country_id']")));
        countrySelector.selectByVisibleText("Romania");

        Select stateSelector =new Select(driver.findElement(By.cssSelector(".select[name='region_id']")));
        stateSelector.selectByVisibleText("Alba");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='postcode']")));
        WebElement zipCode = driver.findElement(By.cssSelector("input[name='postcode']"));
        zipCode.sendKeys("123456");

        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='telephone']"));
        phoneNumber.sendKeys("0733777888");

        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-role='opc-continue']")));
        WebElement nextToPaymentPage = driver.findElement(By.cssSelector("button[data-role='opc-continue']"));
        nextToPaymentPage.click();



    }
}
