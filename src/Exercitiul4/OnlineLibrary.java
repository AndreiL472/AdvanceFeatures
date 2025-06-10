package Exercitiul4;

import java.util.ArrayList;
import java.util.List;

public class OnlineLibrary {
    private List<Book> books;
    private double budget;

    public OnlineLibrary(double budget) {
        this.budget = budget;
        this.books = new ArrayList<>();
    }

    /*
    Implement methods:
addBook(Book book): Adds a book to the library if the user has sufficient funds.
Throws NotEnoughMoneyException if funds are insufficient.
getBook(String title): Returns the requested book if it is in the library.
Throws NoSuchBookException if the book is not found.
     */

    public void addBook(Book book) {
        try {
            if (this.budget < book.getPrice()) {
                throw new NotEnoughMoneyException("Inssuficient money for this book " + book.getTitle());
            }

            books.add(book);
            System.out.println("Books added succesfully inside the list");
            this.budget = this.budget - book.getPrice();
        } catch (NotEnoughMoneyException e) {
            System.out.println("Can not add book" + e.getMessage());
        }
    }

    public Book getBook(String title) throws NotSuckBookException {
        for( Book book: books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new NotSuckBookException("Can't find this book");
    }

    public Book getBook2(String title) throws NotSuckBookException {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElseThrow(() -> new NotSuckBookException("Can't find this book in library"));

    }

    @Override
    public String toString() {
        return "OnlineLibrary{" +
                "books=" + books +
                ", budget=" + budget +
                '}';
    }
}
