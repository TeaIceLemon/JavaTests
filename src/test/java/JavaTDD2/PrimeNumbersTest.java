package JavaTDD2;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumbersTest {
    PrimeNumbers primeNumbers;
    @Before
    public void before(){
        primeNumbers = new PrimeNumbers();
    }

    @Test

    public void isPrimeNumberArrayTest(){
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        assertEquals(expected,primeNumbers.getPrimeNumbers(5));
    }
    @Test
    @Parameters({
            "5,2,3,5",
            "2,2"
    })
    public void isParametrizedPrimeNumberArrayTest(String ... args){
        int range = Integer.parseInt(args[0]);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1 ; i< args.length;i++){
            list.add(Integer.parseInt(args[i]));
        }
       assertEquals(list,primeNumbers.getPrimeNumbers(range));
    }
}
