package book.controller;

import book.entity.Book;
import book.model.BookModel;
import book.model.comparators.AuthorComparator;
import book.model.comparators.PublishingComparator;
import book.model.comparators.YearComparator;
import book.view.BookInput;
import book.view.BookView;


import java.util.Collections;


import static book.view.Constants.*;


    /**
     * @author Savostin Roman
     */

public class BookController {

    private BookModel model;
    private BookView view;
    private PublishingComparator publComp = new PublishingComparator();
    private AuthorComparator authorComp = new AuthorComparator();
    private YearComparator yearComp = new YearComparator();

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

                view.bookOutput(model.bookList(authorComp,
                        new Book (null,BookInput.inputStringValue(view, INPUT_AUTHOR),null,0,0,0)));
                break;
            case 2:
                view.bookOutput(model.bookList(publComp,
                        new Book (null,null,BookInput.inputStringValue(view, INPUT_PUBLISHING),0,0,0)));
                break;
            case 3:
                view.bookOutput(model.bookList(yearComp,
                        new Book (null,null,null,BookInput.inputValue(view,INPUT_YEAR),0,0)));
                break;
            case 4:
                Collections.sort(model.getBooks(), publComp);
                view.bookOutput(model.getBooks());
                break;
            default:
                break;
        }
    }
}


