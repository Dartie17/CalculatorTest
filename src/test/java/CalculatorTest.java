import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int expected1 = 15;
        int result1 = calculator.add(10, 5);
        assertEquals(expected1, result1);
        int expected2 = 20;
        int result2 = calculator.add(10, 10);
        assertEquals(expected2, result2);
    }

    @Test
    void subtraction() {
        Calculator calculator = new Calculator();
        int expected1 = 5;
        int result1 = calculator.subtraction(10, 5);
        assertEquals(expected1, result1);
        int expected2 = 12;
        int result2 = calculator.subtraction(52, 40);
        assertEquals(expected2, result2);
    }

    @Test
    void multiplication() {
        Calculator calculator = new Calculator();
        double expected1 = 58.58;
        double result1 = calculator.multiplication(10.1, 5.8);
        assertEquals(expected1, result1, 0.001);
        double expected2 = 216.45;
        double result2 = calculator.multiplication(18.5, 11.7);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void division() {
        Calculator calculator = new Calculator();
        double expected1 = 2;
        double result1 = calculator.division(10, 5);
        assertEquals(expected1, result1, 0.001);
        double expected2 = 5;
        double result2 = calculator.division(50, 10);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void square() {
        Calculator calculator = new Calculator();
        int expected1 = 25;
        int result1 = calculator.square(5);
        assertEquals(expected1, result1);
        int expected2 = 100;
        int result2 = calculator.square(10);
        assertEquals(expected2, result2);
    }
}