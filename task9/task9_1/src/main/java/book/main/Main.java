package book.main;

import book.controller.BookController;
import book.entity.Book;
import book.model.BookModel;
import book.model.BookRepository;
import book.model.BookRepositoryFile;
import book.view.BookView;

import java.io.IOException;


/**
 * @author Savostin Roman
 */

public class Main {

    /**
     * start program
     */
    public static void main(String[] args){

        BookRepository repository = new BookRepository();
        BookRepositoryFile fileRepository = new BookRepositoryFile();
        BookModel model = new BookModel(fileRepository);
        BookView view = new BookView();

        BookController controller = new BookController(model,view);

        controller.run();

    }
}
