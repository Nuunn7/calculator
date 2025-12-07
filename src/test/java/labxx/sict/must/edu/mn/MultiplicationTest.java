package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Multiplication классын тест
 */
public class MultiplicationTest {
    
    @Test
    public void testMultiplyPositiveNumbers() {
        Multiplication calc = new Multiplication();
        double result = calc.multiply(3.0, 4.0);
        assertEquals(12.0, result, 0.0001);
    }
    
    @Test
    public void testMultiplyNegativeNumbers() {
        Multiplication calc = new Multiplication();
        double result = calc.multiply(-3.0, 4.0);
        assertEquals(-12.0, result, 0.0001);
    }
    
    @Test
    public void testMultiplyByZero() {
        Multiplication calc = new Multiplication();
        double result = calc.multiply(5.0, 0.0);
        assertEquals(0.0, result, 0.0001);
    }
    
    @Test
    public void testMultiplyTwoNegatives() {
        Multiplication calc = new Multiplication();
        double result = calc.multiply(-2.0, -3.0);
        assertEquals(6.0, result, 0.0001);
    }
}