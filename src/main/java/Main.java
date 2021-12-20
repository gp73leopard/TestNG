import model.Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //System.out.print("Введите знак: ");
        String a = sc.nextLine();
        //System.out.print("Введите первое число: ");
        String b = sc.nextLine();
        //System.out.print("Введите второе число: ");
        String c = sc.nextLine();

        String[] str = {
                a,
                b,
                c
        };

        System.out.println(Calculator.execute(str));
    }

}
