package JavaTDD2;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    @Before
    public void before(){
        fizzBuzz = new FizzBuzz();
    }
    @Test
    @Parameters({
            "1,1",
            "4,4",
            "3,Fizz",
            "5,Buzz",
            "15,FizzBuzz"
    })
    public void notChangeNumberTest(int input, String expected){
        assertEquals(expected, fizzBuzz.changeNumber(input));
    }

}
