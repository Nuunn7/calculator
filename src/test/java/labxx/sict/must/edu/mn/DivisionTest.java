package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Division классын тест
 */
public class DivisionTest {
    
    @Test
    public void testDivideNormalNumbers() {
        Division calc = new Division();
        double result = calc.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.0001);
    }
    
    @Test
    public void testDivideNegativeByPositive() {
        Division calc = new Division();
        double result = calc.divide(-10.0, 2.0);
        assertEquals(-5.0, result, 0.0001);
    }
    
    @Test
    public void testDivideTwoNegatives() {
        Division calc = new Division();
        double result = calc.divide(-10.0, -2.0);
        assertEquals(5.0, result, 0.0001);
    }
    
    @Test
    public void testDivideByZeroThrowsException() {
        Division calc = new Division();
        ArithmeticException exception = assertThrows(
            ArithmeticException.class, 
            () -> calc.divide(10.0, 0.0)
        );
        assertEquals("Error: Division by zero is not allowed!", exception.getMessage());
    }
}