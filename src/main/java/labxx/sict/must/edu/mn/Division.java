package labxx.sict.must.edu.mn;

/**
 * Хоёр тоог хуваадаг класс
 */
public class Division {
    
    /**
     * Хоёр тоог хуваана
     * @param a хуваагдах
     * @param b хуваагч
     * @return ноогдвор
     * @throws ArithmeticException тэгээр хуваахыг оролдвол
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed!");
        }
        return a / b;
    }
}