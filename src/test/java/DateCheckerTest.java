import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateCheckerTest {

    private DateChecker checker;

    @BeforeEach
    void setUp() {
        checker = new DateChecker();
    }

    @Test
    void januaryHas31Days() {
        assertTrue(checker.has31Days(Month.JANUARY), "January should have 31 days");
    }

    @Test
    void aprilDoesNotHave31Days() {
        assertFalse(checker.has31Days(Month.APRIL), "April has 30 days, not 31");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class,
            names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    void monthsWith31Days(Month month) {
        assertTrue(checker.has31Days(month), month + " should have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class,
            names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void monthsWith30Days(Month month) {
        assertFalse(checker.has31Days(month), month + " has 30 days, not 31");
    }

    @Test
    void februaryDoesNotHave31Days() {
        assertFalse(checker.has31Days(Month.FEBRUARY), "February has 28 or 29 days");
    }
    @Test
    void nullMonthThrows() {
        assertThrows(IllegalArgumentException.class, () -> checker.has31Days(null));
    }




}