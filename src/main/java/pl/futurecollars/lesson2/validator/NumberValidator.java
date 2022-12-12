package pl.futurecollars.lesson2.validator;

public class NumberValidator {

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isEven(int value) {
        return !isOdd(value);
    }
}
