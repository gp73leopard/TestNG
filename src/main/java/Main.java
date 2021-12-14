import model.Calculator;

public class Main {

    public static void main(String[] args){
        mainTest();
    }
    public static void mainTest(){
        String[] str = {
                "/",
                "25",
                "5",
                "5"
        };
        System.out.println(Calculator.execute(str));
    }
}
