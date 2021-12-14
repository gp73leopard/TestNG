package model;

public class Calculator {
    public static String execute(String[] params) {

        int a = Integer.parseInt(params[1]);
        int b = Integer.parseInt(params[2]);

        if (params[0] == "/"&& b!=0 && b==Integer.parseInt(params[2])) {
            return Integer.toString(a / b);
        } else if (params[0] == "+"&& b!=0 && b==Integer.parseInt(params[2])) {
            return Integer.toString(a + b);
        } else if (params[0] == "-"&& b!=0 && b==Integer.parseInt(params[2])) {
            return Integer.toString(a - b);
        } else if (params[0] == "*"&& b!=0 && a-b>-2147483648) {
            return Integer.toString(a * b);
        } else {
            throw new CalculatorException("Неверный ввод данных");
        }

    }
}
