import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by johnbunky on 21.04.16.
 */
public class TestCase_2 {
    @Test
    public void  TestCase(){
        //Open Firefox browser
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //
        driver.get("file:///home/johnbunky/IdeaProjects/Requirements_implementation.html");
        //
        InputValue(driver, "name", "Tester");
        InputValue(driver, "email", "Test_1@test.com");
        InputValue(driver, "subject", "Tester_1 subject");
        InputValue(driver, "message", "Tester_1 message");
        driver.findElement(By.name("submit")).click();

    }

    private void InputValue(WebDriver driver, String ID, String InputValue) {
        driver.findElement(By.id(ID)).sendKeys(InputValue);
    }
}
