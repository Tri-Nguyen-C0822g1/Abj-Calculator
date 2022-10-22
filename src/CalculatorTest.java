import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;




class CalculatorTest {
    public static int calculator;

    @Test
    @DisplayName("Testing addition")
    void testCalculatorAdd() {
        int firstOperator = 1;
        int secondOperation = 1;
        char operator = '+';
        int expected = 2;
        int result = Calculator.calculate(firstOperator, secondOperation, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing substraction")
    void testCalculatorSub() {
        int firstOperator = 2;
        int secondOperation = 1;
        char operator = '-';
        int expected = 1;
        int result = Calculator.calculate(firstOperator, secondOperation, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing substraction")
    void testCalculatorMul() {
        int firstOperator = 2;
        int secondOperation = 2;
        char operator = '*';
        int expected = 4;
        int result = Calculator.calculate(firstOperator, secondOperation, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing substraction")
    void testCalculatorDiv() {
        int firstOperator = 6;
        int secondOperation = 3;
        char operator = '/';
        int expected = 2;
        int result = Calculator.calculate(firstOperator, secondOperation, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculatorDivByZero() {
        int firstOperator = 2;
        int secondOperation = 0;
        char operator = '/';

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(firstOperator, secondOperation, operator);
                });
    }
}
