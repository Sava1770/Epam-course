package book.entity;

/**
 * @author Savostin Roman
 */

public class Book {

    private String name;
    private String author;
    private String publishing;
    private int year;
    private int numberOfPages;
    private int price;

    /**
     *
     * @param name - name of the book
     * @param author - book author
     * @param publishing - book publishing
     * @param year - publishing year
     * @param numberOfPages - number of pages in the book
     * @param price - book price
     */

    public Book(String name,String author,String publishing,int year,int numberOfPages,int price){
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

  //  public Book(){}

    /**
     * getters and setters
     */

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }
    public String getPublishing() {
        return publishing;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }


}
