import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest extends Assert{

    private Calculator calc = new Calculator();

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                {"/", "9", "3", "3"},
                {"*", "9", "3", "27"},
                {"+", "9", "3", "12"},
                {"-", "9", "3", "6"},
                {"-", "9", "3", "6"},
                {"-", "-3.5", "-3.5", "0.0"},
                {"*", "3.5", "2.0", "7.0"},
        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String[] str) {
        assertEquals(Double.parseDouble(str[3]), Double.parseDouble(calc.execute(str)));
    }
}