package dz17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName(" Test two numbers")
    void sum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(2,3);
        int expected = 5;
        assertEquals(actual,expected);
    }
}