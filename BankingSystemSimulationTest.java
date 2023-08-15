import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankingSystemSimulationTest {

    private Account account;

    @Before
    public void setup() {

        account = new Account(1000, "John Doe", 1000.0);

    }

    @Test
    public void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSufficientBalance() {
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientBalance() {

        account.withdraw(2000);
        assertEquals(-1000.0, account.getBalance(), 0.001);
    }

    @Test
    public void testGetBalance() {
        double balance = account.getBalance();
        assertEquals(1000.0, balance, 0.001);
    }


}