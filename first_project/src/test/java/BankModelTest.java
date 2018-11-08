import model.BankModel;
import model.BankRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BankModelTest {

    private BankModel model;

    @Mock
    private BankRepository repository;

    @Before
    public void setUp(){
        this.model = new BankModel(repository);
    }

    @Test
    public void sumCalculateTest(){

    }
}
