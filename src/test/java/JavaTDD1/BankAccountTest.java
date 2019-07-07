package JavaTDD1;

import JavaTDD1.BankAccount;
import JavaTDD1.BankAccountImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    BankAccount bankAccount;
    @Before
    public void before(){
        bankAccount = new BankAccountImplementation();
    }
    @Test
    public void getAmountTest(){

        assertEquals(0,bankAccount.getAmount());
    }
    @Test
    public void depositTest(){
        //when
        bankAccount.deposit(1000);
        //then
        assertEquals(1000,bankAccount.getAmount());
    }
    @Test
    public void withdrawTest(){
        bankAccount.withdraw(1000);
        assertEquals(-1000, bankAccount.getAmount());
    }
    @Test(expected = IllegalStateException.class)
    public void throwExceptionWhenDebtMoreThan1000(){
            bankAccount.withdraw(1001);
        }

        //then
    }

