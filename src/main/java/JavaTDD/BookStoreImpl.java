package JavaTDD;
public class BookStoreImpl implements BookStore {

    BookRepository bookRepository;
    PaymentService paymentService;

    public BookStoreImpl(BookRepository bookRepository, PaymentService paymentService) {
        this.bookRepository = bookRepository;
        this.paymentService = paymentService;
    }

    public Book borrowBook(String title) {
        Book book = this.bookRepository.findByTitle(title);
        paymentService.pay(book.getPrice());
        return book;
    }
}
