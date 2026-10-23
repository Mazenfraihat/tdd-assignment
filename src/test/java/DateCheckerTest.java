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
}