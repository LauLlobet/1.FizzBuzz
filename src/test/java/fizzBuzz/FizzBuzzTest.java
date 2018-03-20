package fizzBuzz;
import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void forNumber1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.doIt(1);

        assertEquals(answer, "1");
    }

    @Test
    public  void forNumber2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.doIt(2);

        assertEquals(answer,"2");
    }

    @Test
    public void forNumber3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.doIt(3);

        assertEquals(answer, "fizz");
    }
/*    @Test(expected = Exception.class)
    public void catches() throws Exception {
        FizzBuzz k = new FizzBuzz();
        throw new Exception();
    }*/
}