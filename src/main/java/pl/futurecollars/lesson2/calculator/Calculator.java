package pl.futurecollars.lesson2.calculator;

//class should be Calculator
public class Calculator {

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

    public static int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static int division(int value1, int value2) {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            return 0;
        }
    }
}
