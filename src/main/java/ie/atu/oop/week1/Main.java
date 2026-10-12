package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dune", "Frank Herbert", 412);

        System.out.println(book.getStatus());

        book.borrowBook();

        System.out.println(book.getStatus());
    }
}