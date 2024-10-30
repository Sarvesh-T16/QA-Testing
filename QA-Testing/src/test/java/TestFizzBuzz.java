import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    @Test
    public void testFizzBuzz(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value1 = fizzbuzz.playFizzBuzz(5);
        String value2 = fizzbuzz.playFizzBuzz(3);
        String value3 = fizzbuzz.playFizzBuzz(15);
        String value4 = fizzbuzz.playFizzBuzz(11);

        assertEquals("Buzz",value1);
        assertEquals("Fizz",value2);
        assertEquals("FizzBuzz",value3);
        assertEquals("11",value4);

    }
}
