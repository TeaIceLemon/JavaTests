package JavaTDD1;

import JavaTDD1.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(value = Parameterized.class)
//@RunWith(value = JUnitParamsRunner.class)
public class CalculatorAddParametrizedTestJParams {
    int a, b, expected;

    public CalculatorAddParametrizedTestJParams(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Parameterized.Parameters(name = "{0} + {1} = {2} ")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{{1,4,5},{5,7,12},{7,7,14}
        });
    }

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Test
    public void addTest(){
        int result = calculator.add(a,b);
        assertEquals(expected, result);
    }
    private void addParametrizedTest(int a, int b , int expected){
        //when
        int result = calculator.add(a,b);
        //then
        assertEquals(expected, result);
    }
}
