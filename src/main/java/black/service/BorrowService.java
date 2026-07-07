package black.service;

import black.model.Borrow;

import java.util.ArrayList;
import java.util.List;

public class BorrowService {
    public static List<Borrow> borrows = new ArrayList<>();
    public static List<Borrow> returnedBorrows = new ArrayList<>();
    public static List<Borrow> notReturnedBorrow = new ArrayList<>();

    public void saveBorrow(Borrow borrow){
        borrows.add(borrow);
        if(borrow.getReturnDate() != null){
            returnedBorrows.add(borrow);
        }else{
            notReturnedBorrow.add(borrow);
        }
        System.out.println("Borrow Successfully Registered");
    }
    public void printBorrowList(){
        System.out.print("Borrows List: ");
        System.out.println(borrows);
        System.out.println("*".repeat(20));
        System.out.print("Returned Borrows: ");
        System.out.println(returnedBorrows);
        System.out.println("*".repeat(20));
        System.out.print("Not Returned Borrows: ");
        System.out.println(notReturnedBorrow);
        System.out.println("*".repeat(20));
        System.out.printf("Total Borrows: %5d| Returned Borrows: %5d| Not Returned Borrows: %5d", borrows.size(), returnedBorrows.size(), notReturnedBorrow.size());
    }

}
