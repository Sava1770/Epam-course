package book.model;

import book.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BookModel {

    private BookRepository repository;

    /**
     * initialize repository
     * @param repository
     */

    public BookModel(BookRepository repository){
        this.repository = repository;
    }

    public Book[] getBooks(){
        return repository.getBooks();
    }

    /**
     * method for filtration books by publishing
     * @param publishing
     * @return Book[]
     */
    public Book[] bookListByPublishing(String publishing) {
        int k = 0;
        Book[] books = repository.getBooks();
        Book[] temp = new Book[books.length];

        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishing().equals(publishing)) {
                temp[k] = books[i];
                k++;
            }
        }
        return Arrays.copyOf(temp,k);
    }

    /**
     * method for filtration books by author
     * @param author
     * @return Book[]
     */

    public Book[] bookListByAuthor(String author) {
        int k = 0;
        Book[] books = repository.getBooks();
        Book[] temp = new Book[books.length];

        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                temp[k] = books[i];
                k++;
            }
        }
        return Arrays.copyOf(temp,k);
    }

    /**
     * method for filtration books by year
     * @param year
     * @return Book[]
     */

    public Book[] bookListByYear(int year) {
        int k = 0;
        Book[] books = repository.getBooks();
        Book[] temp = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() > year) {
                temp[k] = books[i];
                k++;
            }
        }
        return Arrays.copyOf(temp,k);
    }

}