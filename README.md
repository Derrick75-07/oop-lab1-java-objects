OOP Lab 1: Java Book Tracker
Description
This project is a Java Book Tracker created for OOP Lab 1. It demonstrates classes, objects, fields, methods, references and object state. The program creates three independent Book objects and allows their details to be displayed and their availability to be changed when a book is borrowed.

Java Version and Running the Program
The project uses Java JDK 21 and Maven.

To run the program, open the project in IntelliJ IDEA, make sure JDK 21 is selected, open Main.java and run the main() method using the green Run button.

Object Model
Book is a class that defines the fields and behaviour of a book.

A Book object is an instance created from the Book class. The program creates three objects called firstBook, secondBook and thirdBook.

The fields are title, author, pageCount and available. These fields store the state of each Book object.

The displayDetails() method displays the details of a Book object.

The borrowBook() method changes the available field from true to false when the book is available.

A reference variable such as firstBook refers to a particular Book object.

Example Run
Before borrowing:

Dune by Frank Herbert 412 pages Available: true

After borrowing:

Dune by Frank Herbert 412 pages Available: false

The output shows that borrowBook() changes the state of the same Book object.

createBook Helper Method
The createBook() method is separate from main() because it avoids repeating the same code for creating and initialising each Book object.

It creates a new Book, sets its title, author and page count, and returns the Book reference.

It is declared static because it is called directly from the static main() method.

Debugger Verification
A breakpoint was placed on the final firstBook.displayDetails() call after the book was borrowed.

The debugger showed:

title: Dune
author: Frank Herbert
pageCount: 412
available: false
Using Step Into showed that displayDetails() can access the fields of the current Book object.

Verification
The program was run successfully. The three Book objects displayed different titles, authors and page counts. Borrowing firstBook changed its availability from true to false. A repeated borrowing test displayed the already-on-loan message.

AI Assistance
AI assistance was used to help understand Java and OOP concepts, the purpose of the methods and the Git/lab steps. I reviewed and tested the code and am responsible for understanding and explaining the submitted code and verification results. :::

## Lab 3 - Encapsulation and Class Design

- JDK version: Java 21
- Package: ie.atu.oop.week1

### Constructor validation
The Book constructor checks for null before isBlank because calling isBlank on null would cause a NullPointerException. A title and author cannot be null or blank, and page count must be greater than zero.

### Final fields and status
The title, author, and pageCount fields are final because they should not change after a valid Book object is created. The status is not final because it changes when a book is borrowed or returned.

### Encapsulation
Book does not have a setStatus method. Code must use borrowBook and returnBook so Book can check whether a change is allowed. This prevents borrowing a book twice or returning an already available book.

### Responsibilities
Book validates its own title, author, page count, and status changes. LibraryService checks for a null Book and checks that loan duration is from 1 to 14 days. Main creates objects, calls methods, and prints results.

### Test results
- Successful 7-day loan: status changed from AVAILABLE to ONLOAN.
- Rejected 15-day loan: printed "Loan days must be from 1 to 14" and status remained AVAILABLE.
- Rejected second return: printed "Book is already available" and status remained AVAILABLE.
- Maven build: BUILD SUCCESS.

### Debugger observation
The valid 7-day loan reaches Book.borrowBook because 7 is inside the allowed range. The 15-day loan does not reach Book.borrowBook because LibraryService throws an IllegalArgumentException first. The first book is AVAILABLE before the 15-day request because returnBook was called after the earlier successful loan.

### AI assistance
AI assistance was used to explain the lab instructions, class responsibilities, errors, and testing steps. The code was typed, run, tested, and understood by the student.
## Lab 4 - Collections and Library Catalogue

Lab 4 changed LibraryService from working with one Book passed into a method to owning a List<Book> catalogue.

List<Book> tells Java that the collection stores Book references only. The books field is final, meaning the variable cannot be assigned a different List, but Book objects can still be added to or removed from the ArrayList.

The enhanced for loop variable, Book book, represents one Book reference from the books list on each loop iteration.

findBookByTitle returns the matching Book for a known title such as Dune. It returns null if the title is not found, such as The Hobbit.

removeBook reuses findBookByTitle so the search logic is written once rather than repeated in a second loop.

Main creates Book objects, calls service methods, and prints results. LibraryService owns and searches the catalogue, removes books, and validates loan duration. Book controls its own status changes through borrowBook and returnBook.

Final test result: the catalogue started with 3 books and ended with 2 after Clean Code was removed.

Maven build: BUILD SUCCESS.

AI assistance was used to explain collections, code structure, testing, and debugging steps. The code was typed, tested, and understood by the student.