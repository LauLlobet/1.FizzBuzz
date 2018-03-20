package fizzBuzz;
import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    @Test
    @Parameters({"1, 1",
            "2, 2",
            "4, 4",
            "7, 7"
    })
    public void forNumbersNotMatchingShouldReturnTheNumber(int number, String expectedAnswer) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.doIt(number);

        assertEquals(expectedAnswer,answer);
    }

    @Test
    @Parameters({"12, fizz",
            "3, fizz",
            "6, fizz",
            "9, fizz"
    })
    public void forNumbersMultiplesOf3ShouldReturnFuzz(int number, String expectedAnswer) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.doIt(number);

        assertEquals(expectedAnswer,answer);
    }
    @Test
    @Parameters({"5, buzz",
            "10, buzz",
            "20, buzz",
            "25, buzz"
    })
    public void forNumbersMultiplesOf5ShouldReturnBuzz(int number, String expectedAnswer) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.doIt(number);

        assertEquals(expectedAnswer,answer);
    }
    @Test
    @Parameters({"15, fizzbuzz",
            "30, fizzbuzz",
            "150, fizzbuzz",
            "90, fizzbuzz"
    })
    public void forNumbersMultiplesOf5And3ShouldReturnFizzBuzz(int number, String expectedAnswer) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.doIt(number);

        assertEquals(expectedAnswer,answer);
    }
}