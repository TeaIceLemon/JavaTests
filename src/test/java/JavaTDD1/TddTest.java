package JavaTDD1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TddTest {
    @Test
    public void testOdd(){
        assert isOdd(2);
    }
    @Test
    public void testNotOdd(){
        assertFalse(isOdd(3));
    }

    private boolean isOdd(int number){
        return number%2 ==0;
    }
}
