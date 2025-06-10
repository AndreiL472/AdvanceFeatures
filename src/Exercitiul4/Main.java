package Exercitiul4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 10.99);
        Book b2 = new Book("1984", "George Orwell", "Dystopian", 9.50);
        Book b3 = new Book("Clean Code", "Robert C. Martin", "Programming", 42.00);
        Book b4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 8.75);
        Book b5 = new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", "Programming", 38.50);

        OnlineLibrary library = new OnlineLibrary(40);

            library.addBook(b1);
            library.addBook(b2);
            library.addBook(b3);
            library.addBook(b4);
            library.addBook(b5);

        System.out.println(library);


    }
}
