package fizzBuzz;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void asserts() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.doIt(1), 1);
    }

    @Test(expected = Exception.class)
    public void catches() throws Exception {
        FizzBuzz k = new FizzBuzz();
        throw new Exception();
    }
}