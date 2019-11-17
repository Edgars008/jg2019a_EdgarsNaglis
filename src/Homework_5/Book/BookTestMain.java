package Homework_5.Book;

public class BookTestMain {
    public static void main(String[] args) {
        Book book = new Book("J.KRowling","Garry Potter", 500);
        Book otherBook = new Book("J.KRowling","Garry Potter", 500);
        System.out.println(book.toString());

        System.out.println(book.equals(otherBook));

    }
}
