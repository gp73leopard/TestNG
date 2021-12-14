package model;

import sun.misc.FloatingDecimal;

public class CalculatorException extends RuntimeException{

    public CalculatorException(String s) throws NumberFormatException {
        super(s);
    }


}
