import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

/**
 * Created by johnbunky on 01.05.16.
 */
public class TestCasesBase {

    WebDriver driver = new FirefoxDriver();
    SoftAssert s_assert = new SoftAssert();

     void OpenPage(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("file:///home/johnbunky/IdeaProjects/Requirements_implementation.html");
    }

     void InputData(WebDriver driver, String name, String email, String subject, String message) {
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("subject")).sendKeys(subject);
        driver.findElement(By.id("message")).sendKeys(message);
    }

     void ClickOnSubmit(WebDriver driver) {
        driver.findElement(By.name("submit")).click();
    }


    public void CheckAlert(String AlertText) {
        String Alert_text = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        s_assert.assertEquals(Alert_text, AlertText);
    }
}
