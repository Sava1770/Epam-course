package book.model;

import book.entity.*;

import java.util.*;

public class BookModel {

    //если будет метод изменяющий коллекцию переопределить его таким образом,чтобы он изменял файл


    private BookRepository repository;

    /**
     * initialize repository
     * @param repository
     */

    public BookModel(BookRepository repository){
        this.repository = repository;
    }

    public List<Book> getBooks(){
        return repository.getBookList();
    }

    /**
     * method for filtration books by publishing
     * @param comp - choice of comparator, b - instance with field with necessary value
     * @return filtered Book[]
     */

    public List<Book> bookList(Comparator<Book> comp, Book b) {

        List <Book> books = repository.getBookList();
        List <Book> temp = new ArrayList<>();

        for(int i = 0; i < books.size(); i++){
            if (comp.compare(books.get(i), b) == 0){
                temp.add(books.get(i));
            }
        }
        return temp;
    }

    public List<Book> getJSON(){
       return  repository.getBookList();
    }

//    public void setJSON(){
//        repository.set();
//    }


}