package black.service;

import black.model.Book;
import black.model.Borrow;
import black.model.Member;

import java.time.LocalDate;

public class BorrowServiceTest {
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

        Member member1 = Member
                .builder()
                .id(1)
                .name("Siyavash")
                .family("Afeilyzadeh")
                .age(32)
                .build();
        Member member2 = Member
                .builder()
                .id(2)
                .name("Shiva")
                .family("Elahian")
                .age(16)
                .build();

        Borrow borrow1 = Borrow
                .builder()
                .id(1)
                .book(book1)
                .member(member1)
                .returnDate(LocalDate.now())
                .build();

        Borrow borrow2 = Borrow.builder()
                .id(2)
                .book(book2)
                .member(member2)
                .build();

        BorrowService borrowService = new BorrowService();
        borrowService.saveBorrow(borrow1);
        borrowService.saveBorrow(borrow2);
        borrowService.printBorrowList();

    }
}
