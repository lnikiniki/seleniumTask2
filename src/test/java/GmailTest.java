import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GmailTest {

    @Test
    public void signIn() {
        System.setProperty("webdriver.chrome.driver", "/Users/lni/Downloads/seleniumTask2/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,60);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/gmail/");
        WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
        emailInput.sendKeys("lnierenika@gmail.com");
        driver.findElement(By.cssSelector("div#identifierNext")).click();
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("lnikiniki");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#passwordNext")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#passwordNext")));
        driver.findElement(By.cssSelector("div#passwordNext")).click();
        driver.findElement(By.cssSelector("div.z0")).click();
        WebElement to = driver.findElement(By.cssSelector("textarea[name=\"to\"]"));
        to.sendKeys("str.katherine.l@gmail.com");
        WebElement subject = driver.findElement(By.cssSelector("input[name=\"subjectbox\"]"));
        subject.sendKeys("test");
        driver.findElement(By.cssSelector("td.gU.Up")).click();
    }
}
