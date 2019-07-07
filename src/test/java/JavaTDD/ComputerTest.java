package JavaTDD;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ComputerTest {

    @Test
    public void createDocumentTest(){
        // given
        Keyboard keyboardMock = Mockito.mock(Keyboard.class);
        Printer printerMock = Mockito.mock(Printer.class);
        Computer computer = new Computer(printerMock, keyboardMock);
        when(keyboardMock.read()).thenReturn("Tekst do druku");
        ArgumentCaptor<Document> documentArgumentCaptor =
                ArgumentCaptor.forClass(Document.class);

        // when
        computer.createDocument();

        // then
        verify(printerMock).print(documentArgumentCaptor.capture());
        assertEquals("Tekst do druku",
                documentArgumentCaptor.getValue().getText());
    }
}
