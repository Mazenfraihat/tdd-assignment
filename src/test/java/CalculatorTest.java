import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumOfTwoPositives() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(2, 3));
    }
}