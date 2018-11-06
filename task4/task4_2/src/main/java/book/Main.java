package book;

import book.controller.BookController;
import book.model.BookModel;
import book.model.BookRepository;
import book.view.BookView;

/**
 * @author Savostin Roman
 */

public class Main {

    /**
     * start program
     */
    public static void main(String[] args){

        BookRepository repository = new BookRepository();
        BookModel model = new BookModel(repository);
        BookView view = new BookView();

        BookController controller = new BookController(model,view);
        controller.run();
    }
}
