package JavaTDD;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MathematicianTest {

    Calculator calculator = Mockito.mock(Calculator.class);

    @Test
    public void trudneObliczeniaTest(){
        // given
        Mathematician mathematician = new Mathematician(calculator);
        when(calculator.obliczCalke()).thenReturn(1);
        when(calculator.add(1,1)).thenReturn(3);

        // when
        int result = mathematician.wykonajBardzoTrudneObliczenia();

        // then
        assertEquals(3, result);
        verify(calculator, times(2)).obliczCalke();
    }

}
