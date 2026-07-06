package black.service;

import black.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static List<Book> books = new ArrayList();

    public void saveBook(Book book) {
        books.add(book);
    }

    public void printBookList() {
        System.out.println(books);
    }

    public void countBookList() {
        System.out.println(books.toArray().length);
    }

    public static Book findByName(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;

            }
        }
        return null;
    }

    public static Book findByID(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
