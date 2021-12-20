package model;

public class Calculator {
    public static String execute(String[] params) {

        // Проверка на null
        if (params[1] == null || params[2] == null) {
            throw new CalculatorException("Среди чисел есть пустое поле null");
        }

        // Проверка на то может ли входной параметр быть преобразован в double
        try {
            Double.parseDouble(params[1]);
        } catch (NumberFormatException ex) {
            throw new CalculatorException("Первое значение не является числом");
        }
        // Аналогичная проверка для второго
        try {
            Double.parseDouble(params[2]);
        } catch (NumberFormatException ex) {
            throw new CalculatorException("Второе значение не является числом");
        }

        double a = Double.parseDouble(params[1]);
        double b = Double.parseDouble(params[2]);
        char d = params[0].charAt(0);

        // Общая проверка на слишком большое и слишком малое число, деление на 0 и проверка арифметического знака
        try {
            double c = a + b;
            double c1 = a / b;
            double c2 = a - b;
            double c3 = a * b;
            if (d == '+' && b != 0 && c >= -2147483648 && c <= 2147483647) {
                return Double.toString(c);
            } else if (d == '/' && b != 0 && c <= 2147483647 && c >= -2147483648) {
                return Double.toString(c1);
            } else if (d == '-' && b != 0 && c >= -2147483648 && c <= 2147483647) {
                return Double.toString(c2);
            } else if (d == '*' && b != 0 && c >= -2147483648 && c <= 2147483647) {
                return Double.toString(c3);
            } else {
                throw new CalculatorException("Проверьте правильность параметров");
            }
        } catch (CalculatorException ex) {
            throw new CalculatorException(ex.getMessage());
        }

    }
}

