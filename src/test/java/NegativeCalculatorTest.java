import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest extends Assert{

    private Calculator calc = new Calculator();

    @DataProvider
    public Object[][] negativeData() {
       return new Object[][]{
                {"/", "7", "0"},
                {"/", "-1.1", "-0.0"},
                {"7", "9", "3"},
                {"-", "*", "3"},
                {"-", "adsf", "3"},
                {"/", "1.1", "0"},
                {"/", "1", "dsfas"},
                {"/", "weqr", "dsfas"},
                {"+", null, null},
                {"+", "2547494647", "52"},
                {"-", "-2147486426", "-42"},
        };
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String a, String b, String c) {

        String[] str = {a, b, c};



         try {
             calc.execute(str);
         }catch (CalculatorException e){
             return;
         }
        throw new CalculatorException("Negative test");

    }
}
