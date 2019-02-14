package book.controller;

import book.model.BookModel;
import book.model.BookRepository;
import book.model.entity.Book;
import book.view.Comparators.AuthorComparator;
import book.view.Comparators.PublishingComparator;
import book.view.BookInput;
import book.view.BookView;

import java.util.Arrays;

import static book.view.Constants.Constants.*;

public class BookController {

    private BookRepository repository = new BookRepository();
    private BookModel model = new BookModel(repository);
    private BookView view = new BookView();
    private PublishingComparator comp = new PublishingComparator();
    private AuthorComparator authorComparator = new AuthorComparator();
    private PublishingComparator publishComparator = new PublishingComparator();


    public void getInformation(){

        switch(BookInput.inputValue(view, OUTPUT_SELECT)) {
            case 1:
                model.bookList(authorComparator,
                        new Book(null,BookInput.inputStringValue(view, INPUT_AUTHOR),null,0,0,0));
                break;
            case 2:
                model.bookList(publishComparator,
                        new Book(null,BookInput.inputStringValue(view, INPUT_AUTHOR),null,0,0,0));
                break;
            case 3:
                model.bookListByYear(BookInput.inputValue(view, INPUT_YEAR));
                break;
            case 4:
                Arrays.sort(model.getBooks(), comp);
                model.bookOutput();
                break;
            default:
                break;
        }

    }
}
