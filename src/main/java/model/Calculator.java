package model;

public class Calculator {
    public static String execute(String[] params) {
        double a;
        double b;
        double c;

        try {


            if (params[1] != null && params[2] != null) {
                for (char d : params[1].toCharArray()) {

                    if (!Character.isDigit(d))
                        throw new CalculatorException("Неверный ввод данных");
                }
            } else {
                throw new CalculatorException("Неверный ввод данных");
            }
        }
        catch (CalculatorException ex){
            throw new CalculatorException("Неверный ввод данных");
        }

            a = Double.parseDouble(params[1]);
            b = Double.parseDouble(params[2]);
            c = a+b;
            try {

            if (params[0] == "/" && b != 0 && c >= -2147483648 && c <= 2147483647  && a == Integer.parseInt(params[1])&& params[1] != null && params[2] != null) {
                return Double.toString(a / b);
            } else if (params[0] == "+" && b != 0&& c <= 2147483647 && c >= -2147483648&& a == Integer.parseInt(params[1]) && params[1] != null && params[2] != null) {
                return Double.toString(a + b);
            } else if (params[0] == "-" && b != 0 && c >= -2147483648&& c <= 2147483647 && a == Integer.parseInt(params[1])  && params[1] != null && params[2] != null) {
                return Double.toString(a - b);
            } else if (params[0] == "*" && b != 0 && c >= -2147483648&& c <= 2147483647  && a == Integer.parseInt(params[1]) && params[1] != null && params[2] != null) {
                return Double.toString(a * b);
            }
            else {
                throw new CalculatorException("Неверный ввод данных");
            }

        }

        catch (CalculatorException ex){
            throw new CalculatorException("Неверный ввод данных");
        }



    }
}
