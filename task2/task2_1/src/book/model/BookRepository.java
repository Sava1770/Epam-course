package book.model;

import book.model.entity.Book;

public class BookRepository {
    private Book[] books = new Book[]{new Book("1984 ", "Orwell", "first", 1903, 150, 100),
            new Book("A Doll's House", "Ibsen", "second", 1828, 180, 90),
            new Book("Anna Karenina", "Tolstoy", "first", 1828, 400, 160),
            new Book("The Brothers Karamazov", "Dostoyevsky", "third", 1821, 200, 140),
            new Book("The Castle", "Kafka", "third", 1883, 100, 70),
            new Book("The Divine Comedy", "Alighieri", "first", 1265, 199, 130),
            new Book("Hamlet", "Shakespeare", "third", 1564, 250, 30)};

    public Book[] getBooks() {
        return books;
    }

}

