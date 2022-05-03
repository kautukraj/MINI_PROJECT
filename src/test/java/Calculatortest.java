import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class Calculatortest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void multiplicationTruePositive(){
        assertEquals("Finding multiplication of two number for True Positive", 15, calculator.multiplication(5,3), DELTA);
        assertEquals("Finding multiplication of two number for True Positive", 24, calculator.multiplication(6,4), DELTA);
    }

    @Test
    public void multiplicationFalsePositive(){
        assertNotEquals("Finding multiplication of two number for False Positive", 120, calculator.multiplication(5,8), DELTA);
        assertNotEquals("Finding multiplication of two number for False Positive", 80, calculator.multiplication(4,10), DELTA);
    }

    @Test
    public void cuberootTruePositive(){
        assertEquals("Finding cube root for True Positive", 16, calculator.square(4), DELTA);
        assertEquals("Finding cube root for True Positive", 1, calculator.square(1), DELTA);
    }

    @Test
    public void cuberootFalsePositive(){
        assertNotEquals("Finding cube root for False Positive", 10, calculator.square(3), DELTA);
        assertNotEquals("Finding cube root for False Positive", 20, calculator.square(4), DELTA);

    }



}
