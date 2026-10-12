package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dune", "Frank Herbert", 412);

        book.borrowBook();
        book.returnBook();

        try {
            book.returnBook();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(book.getStatus());
    }
}