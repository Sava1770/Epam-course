package book.model;

import book.entity.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookModelTest {


    private BookModel model;

    /**
     * mock object
     */
    @Mock
    public BookRepository repository;

    /**
     * setup before test
     */
    @Before
    public void setUp() {
        model = new BookModel(repository);
    }

    /**
     * test for all 3 method in this test method
     */
    @Test
    public void bookList() {

        when(repository.getBooks())
                .thenReturn(new Book[]{
                        new Book("1984 ", "Orwell", "fourth", 1903, 150, 100),
                        new Book("A Doll's House", "Ibsen", "third", 1828, 180, 90)});

        Book[] actual = model.bookListByAuthor("Orwell");

        assertThat(actual).isNotNull().hasSize(1);              //check  bookListByAuthor()
        assertThat(actual[0])
                .extracting( "author")
                .contains("Orwell");

        actual = model.bookListByYear(1902);                    //check  bookListByYear()

        assertThat(actual).isNotNull().hasSize(1);
        assertThat(actual[0])
                .extracting("year")
                .contains(1903);

        actual = model.bookListByPublishing("third");            //check  bookListByPublishing()

        assertThat(actual).isNotNull().hasSize(1);
        assertThat(actual[0])
                .extracting("publishing")
                .contains("third");
    }




}