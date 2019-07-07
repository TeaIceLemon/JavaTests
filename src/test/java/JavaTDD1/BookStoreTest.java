package JavaTDD1;

import JavaTDD1.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BookStoreTest {
    PayentService payentService;
    BookStore bookStore;
    BookRepo bookRepo;
    @Before
    public void before(){
        payentService = Mockito.mock(PayentService.class);
        bookRepo = Mockito.mock(BookRepo.class);
        bookStore = new BookStoreImp(bookRepo,payentService);
    }
    @Test
    public void bookTest(){
        //when
    when(bookRepo.findByTitle(anyString())).thenReturn(new Book(100));
    Book book = bookStore.borrowBook("Lord of the rings");

    //then
        assertNotNull(book);
        verify(payentService).pay(100);
    }
}
