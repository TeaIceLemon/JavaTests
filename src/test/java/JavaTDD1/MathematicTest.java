package JavaTDD1;

import JavaTDD1.Calculator;
import JavaTDD1.Mathematic;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MathematicTest {
    Calculator calculator = Mockito.mock(Calculator.class);

    @Test
    public void trudneObliczeniaTest(){
        //given
        Mathematic mathematician = new Mathematic(calculator);
        when(calculator.obliczCalke()).thenReturn(1);
        when(calculator.add(1,1)).thenReturn(3);
        //when
        int result = mathematician.doVeryComplicatedMaths();

        //then
        assertEquals(3, result);
        verify(calculator,times(2)).obliczCalke();
    }
}
