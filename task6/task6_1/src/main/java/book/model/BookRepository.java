package book.model;

import book.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    /**
     * initialize collection of books
     */
    private List<Book> list = new ArrayList<>();

    public BookRepository(){
        list.add(new Book("1984 ", "Orwell", "fourth", 1903, 150, 100));
        list.add(new Book("A Doll's House", "Ibsen", "third", 1828, 180, 90));
        list.add(new Book("Anna Karenina", "Tolstoy", "first", 1828, 400, 160));
        list.add(new Book("The Brothers Karamazov", "Dostoyevsky", "third", 1821, 200, 140));
        list.add(new Book("The Castle", "Kafka", "second", 1883, 100, 70));
        list.add(new Book("The Divine Comedy", "Alighieri", "first", 1265, 199, 130));
        list.add(new Book("Hamlet", "Shakespeare", "third", 1564, 250, 30));
    }
    /**
     * method which return array of books
     * @return List<Book>
     */

    public List<Book> getBookList() {
        return list;
    }

    public void setBookList(List<Book> books){
        list.addAll(list.size()+1,books);
    }

}
