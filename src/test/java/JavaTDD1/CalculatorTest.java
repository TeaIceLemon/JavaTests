package JavaTDD1;

import JavaTDD1.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

//@RunWith(value = Parameterized.class)
//@RunWith(value = JUnitParamsRunner.class)
public class CalculatorTest {
//    int a, b, expected;
//
//    public JavaTDD1.CalculatorTest(int a, int b, int expected) {
//        this.a = a;
//        this.b = b;
//        this.expected = expected;
//    }
//    @Parameterized.Parameters(name = "{0} + {1} = {2} ")
//    public static Collection<Object[]> data(){
//        return Arrays.asList(new Object[][]{{1,4,5},{5,7,12},{7,7,14}
//        });
//    }
//
//
//    @Rule
   public ExpectedException expectedException = ExpectedException.none();
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }
 //   @Test
//    public void addTest(){
////        //given
////        int a = 2, b= 3;
////        //when
////        int result = calculator.add(a,b);
////
////        //then
////        assertEquals(5, result);
////        addParametrizedTest(1,4,5);
////        addParametrizedTest(5,7,12);
////        addParametrizedTest(7,7,14);
//        int result = calculator.add(a,b);
//        assertEquals(expected, result);
//    }
//    private void addParametrizedTest(int a, int b , int expected){
//        //when
//        int result = calculator.add(a,b);
//        //then
//        assertEquals(expected, result);
//    }
    @Test
    public void subTest(){
        //given
        int a = 6, b =3;
        //when
        int result = calculator.substract(a,b);
        //then
        assertEquals(3,result);
    }

    @Test
    public void multiTest(){
        //given
        int a = 4, b =5;
        //when
        int result = calculator.multipyle(a,b);
        //then
        assertEquals(20,result);
    }
//    @Test
//    public void divTest(Integer a, Integer b){
//        //given
//        Integer a = 30, b = 6;
//        if(b==0) throw new IllegalArgumentException();
//        //when
//        int result = calculator.divide(a,b);
//        //then
//        assertEquals(5,result);
//    }
//    @Test(expected = IllegalArgumentException.class)
//    public void divideByZeroTest(){
//    //given
//        int a = 2;
//        int b = 0;
//        //when
//        double result = calculator.divide(a,b);
//        //then
//        //throw exception
//    }
    @Test
    public void divideNullPointerTest() {
        //given
        Integer a = null;
        Integer b = 2;
        expectedException.expect(IllegalArgumentException.class);
        //when
        try {
            double result = calculator.divide(a, b);
            assert false;
        } catch (IllegalArgumentException e) {
            assertEquals("Bad argument", e.getMessage());
            assert true;
        }

    }
}
