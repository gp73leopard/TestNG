import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest extends Assert{
    private Calculator calc = new Calculator();

    @DataProvider
    public Object[][] negativeData() {
        return new Object[][]{
                {"/", "9", "3"},
                {"!", "9", "3"},
                {"7", "9", "3"},
                {"-", "*", "3"},
                {"-", "!", "3"},
        };
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String first, String second, String third) {
        String[] str ={
                first,
                second,
                third,
        };
        calc.execute(str);
    }
}
