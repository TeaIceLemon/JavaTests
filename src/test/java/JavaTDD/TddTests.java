package JavaTDD;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TddTests {

    @Test
    public void testOdd(){
        assert isOdd(2);
    }

    @Test
    public void testNotOdd(){
        assertFalse(isOdd(3));
    }


    private boolean isOdd(int param) {
        return param % 2 == 0;
    }
}
