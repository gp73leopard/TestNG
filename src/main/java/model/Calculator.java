package model;

public class Calculator {
    public static String execute(String[] params) {

        int a = Integer.parseInt(params[1]);
        int b = Integer.parseInt(params[2]);

        if (params[0] == "/"&& a==Integer.parseInt(params[1]) && b==Integer.parseInt(params[2])) {
            return Integer.toString(a / b);
        } else if (params[0] == "+"&& a==Integer.parseInt(params[1]) && b==Integer.parseInt(params[2])) {
            return Integer.toString(a + b);
        } else if (params[0] == "-"&& a==Integer.parseInt(params[1]) && b==Integer.parseInt(params[2])) {
            return Integer.toString(a - b);
        } else if (params[0] == "*"&& a==Integer.parseInt(params[1]) && b==Integer.parseInt(params[2])) {
            return Integer.toString(a * b);
        } else {
            throw new CalculatorException("Неверный ввод данных");
        }

    }
}
