package book.view;

import book.entity.Book;

public class BookView {
    /**
     * all constants
     */

    public static final String WRONG_INPUT_NUMBER = "Wrong input!Please repeat.";
    public static final String OUTPUT_SELECT = "PRESS: 1 - Take list of books by author;\n" +
                                                      "2 - Take a list of books by publishing\n"+
                                                      "3 - Take a list of books after some year\n"+
                                                      "4 - Sort books by publishing";
    public static final String INPUT_AUTHOR = "Input author name";
    public static final String INPUT_PUBLISHING = "Input a name of publishing house";
    public static final String INPUT_YEAR = "Input year";


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
    public void bookOutput(Book[] books){
        if(books.length <= 0){
            System.out.println("No matches");
        }
        else{
            for(int i = 0; i < books.length; i++) {
                System.out.print(books[i].getName() + "  (publishing:" + books[i].getPublishing() +
                                 ")  (author:" + books[i].getAuthor() + ")  (year:" + books[i].getYear()+
                                 ")  (number of pages:" + books[i].getNumberOfPages() +
                                 ")  (price:" + books[i].getPrice() + ")\n");
            }
        }
    }
}
