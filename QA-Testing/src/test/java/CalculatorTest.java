import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        double actualValue1 = calculator.add(1,2);
        double actualValue2 = calculator.add(-1,2);
        double actualValue3 = calculator.add(0,2);

        assertEquals(actualValue1,3);
        assertEquals(actualValue2,1);
        assertEquals(actualValue3,2);
    }

    @Test
    public void testMinus(){
        Calculator calculator = new Calculator();
        double actualValue1 = calculator.minus(1,2);
        double actualValue2 = calculator.minus(-1,2);
        double actualValue3 = calculator.minus(6,2);

        assertEquals(actualValue1,-1);
        assertEquals(actualValue2,-3);
        assertEquals(actualValue3,4);
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        double actualValue1 = calculator.multiply(1,2);
        double actualValue2 = calculator.multiply(-1,2);
        double actualValue3 = calculator.multiply(6,2);

        assertEquals(actualValue1,2);
        assertEquals(actualValue2,-2);
        assertEquals(actualValue3,12);
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        double actualValue1 = calculator.divide(1,2);
        double actualValue2 = calculator.divide(-4,2);
        double actualValue3 = calculator.divide(6,0);

        assertEquals(actualValue1,0.5);
        assertEquals(actualValue2,-2);
        assertEquals(actualValue3,Double.POSITIVE_INFINITY);
    }


}
