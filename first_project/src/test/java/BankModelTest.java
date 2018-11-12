import entity.Bank;
import model.BankModel;
import model.BankRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import static org.mockito.Mockito.when;

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

        when(repository.getBanks())
                .thenReturn(Arrays.asList(new Bank("Privat", 12, true, 1, true)));

        double actual = model.sumCalculate(1,100,0);
        Assert.assertEquals(112.0, actual,0.1);

        actual = model.sumCalculate(2,100,0);
        Assert.assertEquals(125.44, actual,0.1);

    }
}
