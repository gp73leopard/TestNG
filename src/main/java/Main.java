import model.Calculator;

public class Main {
    public static void mainTest(String[] str){
        Calculator.execute(str);
    }
    public static void main(String[] args){
        String[] str = {
                "/",
                "2",
                "1",
                "2"
        };

        mainTest(str);

    }

}
