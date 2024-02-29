package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    public static void signIn(WebDriver driver, String username, String password) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']:first-child")));
        WebElement clickOnSignIn = driver.findElement(By.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']:first-child"));
        clickOnSignIn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        WebElement addUsername = driver.findElement(By.cssSelector("#email"));
        addUsername.sendKeys(username);

        WebElement addPassword = driver.findElement(By.cssSelector("input[name='login[password]']"));
        addPassword.sendKeys(password);

        WebElement clickOnSignInCTA = driver.findElement(By.cssSelector(".action.login.primary"));
        clickOnSignInCTA.sendKeys(password);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span")));

    }
}
