import book.entity.Book;
import book.model.BookModel;
import book.model.BookRepository;
import book.model.BookRepositoryFile;
import book.model.comparators.AuthorComparator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookModelTest {


    private BookModel model;

    /**
     * mock object
     */
    private AuthorComparator authorComp = new AuthorComparator();
    @Mock
    public BookRepository repository;

    public BookRepositoryFile repositoryFile;
    /**
     * setup before test
     */
    @Before
    public void setUp() {
        model = new BookModel(repository);

        List<Book> j = new ArrayList<>();
        j.add( new Book("1984 ", "Orwell", "fourth", 1903, 150, 100));
        j.add(new Book("A Doll's House", "Ibsen", "third", 1828, 180, 90));

        when(repository.getBookList())
                .thenReturn(j);
    }

    /**
     * test this method
     */
    @Test
    public void bookList() {

        List<Book> actual = model.bookList(authorComp,new Book(null,"Orwell",null,0,0,0));

        assertThat(actual).isNotNull().hasSize(1);              //check  bookListByAuthor()
        assertThat(actual.get(0))
                .extracting( "author")
                .contains("Orwell");

//        actual = model.bookList(1902);                      //check  bookListByYear()
//
//        assertThat(actual).isNotNull().hasSize(1);
//        assertThat(actual[0])
//                .extracting("year")
//                .contains(1903);
//
//        actual = model.bookList("third");            //check  bookListByPublishing()
//
//        assertThat(actual).isNotNull().hasSize(1);
//        assertThat(actual[0])
//                .extracting("publishing")
//                .contains("third");
    }




}