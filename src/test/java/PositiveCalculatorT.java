import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorT extends Assert{

    private Calculator calc = new Calculator();

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                {"/", "9", "3", "3"},
                {"*", "9", "3", "27"},
                {"+", "9", "3", "12"},
                {"-", "9", "3", "6"},
                {"-", "9", "3", "9"},
        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String[] str) {


        assertEquals(str[3], calc.execute(str));
    }
}