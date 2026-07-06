package black.service;

import black.model.Book;

public class BookServiceTest {
    public static void main(String[] args) {
        Book book1 = Book
                .builder()
                .id(1)
                .name("LOTR")
                .author("JRRT")
                .pages(1373)
                .build();

        Book book2 = Book
                .builder()
                .id(2)
                .name("GOT")
                .author("JRRM")
                .pages(2278)
                .build();

        BookService bookService = new BookService();
        bookService.saveBook(book1);
        bookService.saveBook(book2);

        bookService.printBookList();
        bookService.countBookList();

        System.out.println(BookService.findByName("LOTR"));
        System.out.println(BookService.findByName("Spring"));

        System.out.println(BookService.findByID(2));
        System.out.println(BookService.findByID(3));

    }
}
