package book.controller;

import book.model.BookModel;
import book.model.comparators.BookCompare;
import book.view.BookInput;
import book.view.BookView;

import java.util.Arrays;

import static book.view.BookView.*;

    /**
     * @author Savostin Roman
     */

public class BookController {

    private BookModel model;
    private BookView view;
    private BookCompare comp = new BookCompare();

    /**
     * initializing parameters
     * @param model parameter for working with the class BookModel.
     * @param view parameter for working with the class BookView.
     */
    public BookController(BookModel model, BookView view){
        this.model = model;
        this.view = view;
    }

    /**
    *   method for run program
    */

    public void run(){

        switch(BookInput.inputValue(view, OUTPUT_SELECT)) {
            case 1:
                view.bookOutput(model.bookListByAuthor(BookInput.inputStringValue(view,INPUT_AUTHOR)));
                break;
            case 2:
                view.bookOutput(model.bookListByPublishing(BookInput.inputStringValue(view,INPUT_PUBLISHING)));
                break;
            case 3:
                view.bookOutput(model.bookListByYear(BookInput.inputValue(view,INPUT_YEAR)));
                break;
            case 4:
                Arrays.sort(model.getBooks(), comp);
                view.bookOutput(model.getBooks());
                break;
            default:
                break;
        }

    }
}
