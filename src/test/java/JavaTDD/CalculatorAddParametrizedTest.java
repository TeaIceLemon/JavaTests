package JavaTDD;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculatorAddParametrizedTest {

    int a;
    int b;
    int expected;

    Calculator calculator;


    public CalculatorAddParametrizedTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters( name = "a = {0} b ={1} result ={2}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,2,3}, {2,3,5}, {4,4,8}
        });
    }

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }
}
