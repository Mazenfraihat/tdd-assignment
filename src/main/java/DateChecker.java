/**
 * Checks if a month has 31 days.
 * February returns false (it has 28 or 29 days).
 * Null throws IllegalArgumentException.
 */
public class DateChecker {

    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month must not be null");
        }
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> true;
            default -> false;
        };
    }
}