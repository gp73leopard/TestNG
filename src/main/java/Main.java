import model.Calculator;

public class Main {

    public static void main(String[] args){
        mainTest();
    }
    public static void mainTest(){
        String[] str = {
                "/",
                "2",
                "1",
                "2"
        };
        System.out.println(Calculator.execute(str));
    }
}
