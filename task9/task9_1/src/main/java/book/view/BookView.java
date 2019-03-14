package book.view;

import book.entity.Book;

import java.util.List;

public class BookView {

    /**
     * method for print message
     * @param message - message which we should print
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * method for output books which we need
     * @param books - array of books
     */
    public void bookOutput(List<Book> books){
        if(books.size() <= 0){
            System.out.println("No matches");
        }
        else{
            for(int i = 0; i < books.size(); i++) {
                System.out.print(books.get(i).toString());
            }
        }
    }
}
