package JavaTDD;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest(){
        // given
        int a = 2;
        int b = 0;

        // when
        double result = calculator.divide(a, b);

        // then
        // throw exception
    }

    @Test
    public void divideNullPointerTest(){
        // given
        Integer a = null;
        Integer b = 2;

        // when
        try {
            double result = calculator.divide(a, b);
            assert false;
        } catch (IllegalArgumentException exception) {
            assertEquals("Bad argument", exception.getMessage());
            assert true;
        }
    }


    @Test
    public void divideByNullPointerTest(){
        // given
        Integer a = 1;
        Integer b = null;
        expectedException.expect(IllegalArgumentException.class);

        // when
        double result = calculator.divide(a,b);

        // then
        // throws exception
    }

}
