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



}
