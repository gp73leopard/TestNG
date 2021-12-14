import org.testng.Assert;
import org.testng.annotations.*;
import java.lang.String;

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
    public void positiveTest(String first, String second, String third, String rezult) {
        String[] str ={
                first,
                second,
                third,
        };
        assertEquals(rezult, calc.execute(str));
    }
}