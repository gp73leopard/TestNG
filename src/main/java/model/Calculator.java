package model;

public class Calculator {
    public static String execute(String[] params) {

        double a;
        double b;


       if (params[1] == null || params[2] == null) {
            throw new CalculatorException("Одно из значений явлется пустым полем");
        }
        try {
            Double.parseDouble(params[1]);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Неверный ввод данных");
        }
        try {
            Double.parseDouble(params[2]);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Неверный ввод данных");
        }

        a = Double.parseDouble(params[1]);
        b = Double.parseDouble(params[2]);


        /*try {
           if(a/2 < a && b/2 < b)
           {System.out.println("dasfa");}
           else{
               throw new NumberFormatException("Неверный ввод данных");
           }
        }
        catch (CalculatorException ex){
            throw new CalculatorException("Неверный ввод данных");
        }
            /*if (params[1] == null || params[2] == null) {

                for (char d : params[1].toCharArray()) {

                    if (Character.isDigit(d))

                        for (char e : params[2].toCharArray()) {

                            if (Character.isDigit(e))
                                continue;
                            }
                            else{
                        throw new CalculatorException("Неверный ввод данных");
                    }

                }
            } else {
                throw new CalculatorException("Неверный ввод данных");
            }

        }
        catch (CalculatorException ex){
            throw new CalculatorException("Неверный ввод данных");
        }*/
//
            try {
                double c = a+b;
                double c1 = a - b;
                double c2= a / b;
                double c3 = a * b;
                if (params[0] == "/" && b != 0 && c >= -2147483648 && c <= 2147483647) {
                    return Double.toString(c2);
                } else if (params[0] == "+" && b != 0 && c <= 2147483647 && c >= -2147483648) {
                    return Double.toString(c);
                } else if (params[0] == "-" && b != 0 && c >= -2147483648 && c <= 2147483647) {
                    return Double.toString(c1);
                } else if (params[0] == "*" && b != 0 && c >= -2147483648 && c <= 2147483647) {
                    return Double.toString(c3);
                } else {
                    throw new CalculatorException("Неверный ввод данных");
                }

            } catch (CalculatorException ex) {
                throw new CalculatorException("Неверный ввод данных");
            }


    }
}
