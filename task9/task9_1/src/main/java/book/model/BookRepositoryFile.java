package book.model;

import book.entity.Book;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryFile extends BookRepository {

    private String path;
    private String fileName;
    private ObjectMapper objectMapper = new ObjectMapper();
    private List<Book> books = new ArrayList<>();

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setJSON(){
        setPath("C:\\Users\\romao\\IdeaProjects\\Epam\\task6\\task6_1\\src\\main\\resources");
        setFileName("/book.json");
        setJSON(path,fileName);
    }

    public void setJSON(String path, String fileName){
        try{
            objectMapper.writeValue(new File(path+fileName), books);
        }
        catch(IOException e){
            System.err.println(e);
        }
    }

    private List<Book> getJSON(){
        setPath("C:\\Users\\romao\\IdeaProjects\\Epam\\task6\\task6_1\\src\\main\\resources");
        setFileName("/book.json");

        return getJSON(path, fileName);
    }

    private List<Book> getJSON(String path, String fileName) {
        try{
            books = objectMapper.readValue(new File(path+fileName), new TypeReference<List<Book>>() {
        });
        }catch(IOException e){
            System.out.println("mistake");
            return null;
        }
        return books;
    }

    @Override
    public List<Book> getBookList(){
        return getJSON();
    }

    @Override
    public void setBookList(List <Book> list){
        books.addAll(list);
        setJSON();
    }

}
