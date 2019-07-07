package JavaTDD;

import JavaTDD.BankAccount;
import JavaTDD.BankAccountImp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    BankAccount bankAccount;

    @Before
    public void before(){
        bankAccount = new BankAccountImp();
    }

    @Test
    public void getStartAmountTest(){
        assertEquals(0, bankAccount.getAmount());
    }

    @Test
    public void depositIncreaseAmountTest(){
        // when
        bankAccount.deposit(1000);

        // then
        assertEquals(1000, bankAccount.getAmount());
    }

    @Test
    public void withdrawDecreaseAmountTest() {
        // when
        bankAccount.withdraw(1000);

        // then
        assertEquals(-1000, bankAccount.getAmount());
    }

    @Test(expected = IllegalStateException.class)
    public void throwExceptionWhenDebtMoreThan1000(){
        // when
        bankAccount.withdraw(1001);

        // then
        // throw exception
    }
}
