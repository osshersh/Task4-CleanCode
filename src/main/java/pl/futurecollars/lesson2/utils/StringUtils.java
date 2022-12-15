package pl.futurecollars.lesson2.utils;

public class StringUtils {

    public static char[] reverseString(String value) {
        if (value == null || value.length() == 0) {
            return null;
        }

        char[] chars = value.toCharArray();
        char[] revers = new char[chars.length];

        for (int i = chars.length - 1; i >= 0; i--) {
            revers[chars.length - i - 1] = chars[i];
        }
        return revers;
    }
}
