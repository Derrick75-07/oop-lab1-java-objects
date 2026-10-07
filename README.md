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