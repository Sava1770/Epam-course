package book;

import java.util.Arrays;

public class BookController {

    private BookModel model = new BookModel();
    private BookView view = new BookView();
    private BookCompare comp = new BookCompare();


    public void getInformation(){

        switch(BookInput.inputValue(view, view.OUTPUT_SELECT)) {
            case 1:
                model.bookListByAuthor(BookInput.inputStringValue(view,view.INPUT_AUTHOR));
                break;
            case 2:
                model.bookListByPublishing(BookInput.inputStringValue(view,view.INPUT_PUBLISHING));
                break;
            case 3:
                model.bookListByYear(BookInput.inputValue(view,view.INPUT_YEAR));
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
