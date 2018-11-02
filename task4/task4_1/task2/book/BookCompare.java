package Task4_1.task2.book;

import java.util.Comparator;

public class BookCompare implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublishing().compareToIgnoreCase(o2.getPublishing());
    }
}
