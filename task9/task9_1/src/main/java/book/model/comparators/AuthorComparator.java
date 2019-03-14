package book.model.comparators;

import book.entity.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1,  Book b2){
        return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
    }
}
