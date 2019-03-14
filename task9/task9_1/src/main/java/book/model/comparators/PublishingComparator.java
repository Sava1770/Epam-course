package book.model.comparators;

import book.entity.Book;

import java.util.Comparator;

public class PublishingComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2){
        return b1.getPublishing().compareToIgnoreCase(b2.getPublishing());
    }
}

