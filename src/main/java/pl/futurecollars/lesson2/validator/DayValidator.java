package pl.futurecollars.lesson2.validator;

public class DayValidator {

    public static String printDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return "There is no such a day!";
        }
    }
}
