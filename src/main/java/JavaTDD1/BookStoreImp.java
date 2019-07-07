package JavaTDD1;

public class BookStoreImp implements BookStore {

   private BookRepo bookRepo;
    private PayentService payentService;
    public BookStoreImp(BookRepo bookRepo,PayentService payentService ) {
        this.bookRepo = bookRepo;
        this.payentService = payentService;
    }

    public Book borrowBook(String title) {
        Book book =this.bookRepo.findByTitle(title);
        payentService.pay(book.getPrice());
        return book;
    }
}
