package JavaTDD;

import JavaTDD.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookStoreTest {

    BookStore bookStore;
    BookRepository bookRepository;
    PaymentService paymentService;

    @Before
    public void before(){
        paymentService = Mockito.mock(PaymentService.class);
        bookRepository = Mockito.mock(BookRepository.class);
        bookStore = new BookStoreImpl(bookRepository, paymentService);
    }

    @Test
    public void borrowBookTest(){
        // when
        when(bookRepository.findByTitle("Lord of the rings"))
                .thenReturn(new Book());
        Book book = bookStore.borrowBook("Lord of the rings");

        // then
        assertNotNull(book);
    }

    @Test
    public void borrowBookGetPaid(){
        // when
        when(bookRepository.findByTitle(anyString()))
                .thenReturn(new Book(100));
        Book book = bookStore.borrowBook("Lord of the rings");

        // then
        assertNotNull(book);
        verify(paymentService).pay(100);
    }
}
