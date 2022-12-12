package pl.futurecollars.lesson2.converter;

public class TextConverter {

    public static String convert(String value) {

        if (value == null || value.length() == 0) {
            return value;
        }

        String substring = "";
        String[] text = value.split("\\s");

        for (int i = 0; i <= text.length - 1; i++) {
            if (i % 2 != 0) {
                substring = substring + (text[i].toUpperCase());
            } else {
                substring = substring + (text[i].toLowerCase());
            }
        }
        return substring;
    }
}
