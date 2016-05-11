import org.testng.annotations.Test;

/**
 * Created by johnbunky on 21.04.16.
 */
public class TestCases  extends TestCasesBase {



    @Test
    public void testCase2(){
        OpenPage(driver);
        InputData(driver, "Tester", "Test_1@test.com", "Tester_1 subject", "Tester_1 message");
        ClickOnSubmit(driver);
        // TODO validation
    }
    @Test
    public void testCase3(){
        OpenPage(driver);
        InputData(driver, "", "Test_1@test.com", "Tester_1 subject", "Tester_1 message");
        ClickOnSubmit(driver);
        CheckAlert("This field is required and can not be empty");
    }
    @Test
    public void testCase4(){
        OpenPage(driver);
        InputData(driver, "Tester", "", "Tester_1 subject", "Tester_1 message");
        ClickOnSubmit(driver);
        CheckAlert("This field is required and can not be empty");
    }
    @Test
    public void testCase5(){
        OpenPage(driver);
        InputData(driver, "Tester", "Test_1@test.com", "", "Tester_1 message");
        ClickOnSubmit(driver);
        CheckAlert("This field is required and can not be empty");
    }
    @Test
    public void testCase6(){
        OpenPage(driver);
        InputData(driver, "Tester", "Test_1@test.com", "Tester_1 subject", "");
        ClickOnSubmit(driver);
        CheckAlert("This field is required and can not be empty");
    }

}
