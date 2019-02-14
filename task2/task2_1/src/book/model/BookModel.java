package book.model;

import book.model.entity.Book;

import java.util.Comparator;

public class BookModel {

    private BookRepository repository;

    public BookModel(BookRepository repository){
        this.repository = repository;
    }

    public void bookListByYear(int year) {
        int i = 0, k = 0;
        for (; i < repository.getBooks().length; i++) {
            if ( repository.getBooks()[i].getYear() > year) {
                System.out.print( repository.getBooks()[i].getName() + "\n");
            } else {
                k++;
            }
        }
        if (i == k) {
            System.out.print("No matches");
        }
    }

    public void bookList(Comparator<Book> comp, Book b){
        int i = 0, k = 0;
        for (; i < repository.getBooks().length; i++) {
            if (comp.compare(repository.getBooks()[i], b) == 0) {
                System.out.print(repository.getBooks()[i].getName() + "\n");
            } else {
                k++;
            }
        }
        if (i == k) {
            System.out.print("No matches");
        }
    }

    public void bookOutput(){

       for(int i = 0; i < repository.getBooks().length; i++){
           System.out.print( repository.getBooks()[i].getName() + "  " + repository.getBooks()[i].getPublishing() + "\n");
       }
    }

    public Book[]  getBooks(){
        return repository.getBooks();
    }

}