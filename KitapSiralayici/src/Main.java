import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> ts1 = new TreeSet<>(new CompareForName());
        Book book1 = new Book("A", 4, 10);
        Book book2 = new Book("D", 2, 20);
        Book book3 = new Book("C", 5, 30);
        Book book4 = new Book("E", 1, 40);
        Book book5 = new Book("B", 3, 50);
        ts1.add(book1);
        ts1.add(book2);
        ts1.add(book3);
        ts1.add(book4);
        ts1.add(book5);
        System.out.println("İsme Göre Sıralama: ");
        for (Book book : ts1) {
            System.out.println(book.getName() + "  " + book.getPageNumber() + "  " + book.getDate());
        }
        TreeSet<Book> ts2 = new TreeSet<>(new CompareForPageNumber());
        ts2.add(book1);
        ts2.add(book2);
        ts2.add(book3);
        ts2.add(book4);
        ts2.add(book5);
        System.out.println("Sayfa Sayısına Göre Sıralama: ");
        for (Book book : ts2) {
            System.out.println(book.getName() + "  " + book.getPageNumber() + "  " + book.getDate());
        }
    }
}
