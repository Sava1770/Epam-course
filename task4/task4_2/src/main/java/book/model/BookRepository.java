package book.model;

import book.entity.Book;

public class BookRepository {

    /**
     * initialize book array
     */

    private Book[] books = new Book[]{new Book("1984 ", "Orwell", "fourth", 1903, 150, 100),
            new Book("A Doll's House", "Ibsen", "third", 1828, 180, 90),
            new Book("Anna Karenina", "Tolstoy", "first", 1828, 400, 160),
            new Book("The Brothers Karamazov", "Dostoyevsky", "third", 1821, 200, 140),
            new Book("The Castle", "Kafka", "second", 1883, 100, 70),
            new Book("The Divine Comedy", "Alighieri", "first", 1265, 199, 130),
            new Book("Hamlet", "Shakespeare", "third", 1564, 250, 30)};

    /**
     * method which return array of books
     * @return Book[]
     */
    public Book[] getBooks() {
        return books;
    }
}
