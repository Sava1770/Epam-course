package Task4_1.task2.book;

public class BookModel {

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

    public void bookListByAuthor(String author) {
        int i = 0, k = 0;
        for (; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.print(books[i].getName() + "\n");
            } else {
                k++;
            }
        }
        if (i == k) {
            System.out.print("No matches");
        }
    }

    public void bookListByPublishing(String publishing) {
        int i = 0, k = 0;
        for (; i < books.length; i++) {
            if (books[i].getPublishing().equals(publishing)) {
                System.out.print(books[i].getName() + "\n");
            } else {
                k++;
            }
        }
        if (i == k) {
            System.out.print("No matches");
        }
    }

    public void bookListByYear(int year) {
        int i = 0, k = 0;
        for (; i < books.length; i++) {
            if (books[i].getYear() > year) {
                System.out.print(books[i].getName() + "\n");
            } else {
                k++;
            }
        }
        if (i == k) {
            System.out.print("No matches");
        }
    }

    public void bookOutput(){

       for(int i = 0; i < books.length; i++){
           System.out.print(books[i].getName() + "  " + books[i].getPublishing() + "\n");
       }

    }


}