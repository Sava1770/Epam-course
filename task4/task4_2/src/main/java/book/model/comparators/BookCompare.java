package book.model.comparators;

import book.entity.Book;

import java.util.Comparator;

/**
 * @author Savostin Roman
 */

public class BookCompare implements Comparator<Book> {

    public int compare(Book o1, Book o2) {
        return o1.getPublishing().compareToIgnoreCase(o2.getPublishing());
    }
}
