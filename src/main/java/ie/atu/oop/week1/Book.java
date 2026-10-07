package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;
    public void displayDetails() {
        System.out.println(title + " by " + author);
        System.out.println(pageCount + " pages");
        System.out.println("Available: " + available);
    }
}