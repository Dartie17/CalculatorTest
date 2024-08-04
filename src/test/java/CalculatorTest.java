import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    void when10Add15AsStringThen15()  {
        int expected = 15;
        int result = calculator.add("10", "5");
        assertEquals(expected, result);
    }

    @Test
    void when10Add10Then20() {
        int expected = 20;
        int result = calculator.add("10", "10");
        assertEquals(expected, result);
    }

    @Test
    void whenInputIncorrectValueThenThrowException() {
        assertThrows(NumberFormatException.class, () -> calculator.add("Hello", "10"));
    }

    @Test
    void when10Subtract5Then5() {
        int expected = 5;
        int result = calculator.subtraction(10, 5);
        assertEquals(expected, result);
    }

    @Test
    void when52Subtract40Then12() {
        int expected = 12;
        int result = calculator.subtraction(52, 40);
        assertEquals(expected, result);
    }

    @Test
    void when10Multi5Then50() {
        double expected = 50;
        double result = calculator.multiplication(10, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when21Multi3Then63() {
        double expected = 63;
        double result = calculator.multiplication(21, 3);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when10Divide5Then2() {
        double expected = 2;
        double result = calculator.division(10, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when50Divide10Then5() {
        double expected = 5;
        double result = calculator.division(50, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void when5SquareWhen25() {
        int expected = 25;
        int result = calculator.square(5);
        assertEquals(expected, result);
    }

    @Test
    void when10SquareWhen100() {
        int expected = 100;
        int result = calculator.square(10);
        assertEquals(expected, result);
    }
}