
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BankServiceTest {

    @Test
    void depositShouldIncreaseBalance() {
        NotificationService notification = mock(NotificationService.class);
        BankService bankService = new BankService(notification);
        BankAccount account = new BankAccount();

        bankService.deposit(account, 1000);

        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void successfulDepositShouldSendNotification() {
        NotificationService notification = mock(NotificationService.class);
        BankService bankService = new BankService(notification);
        BankAccount account = new BankAccount();

        bankService.deposit(account, 1000);

        verify(notification).send("Sikeres befizetés: 1000.0 Ft");
    }

    @Test
    void failedDepositShouldNotSendNotification() {
        NotificationService notification = mock(NotificationService.class);
        BankService bankService = new BankService(notification);
        BankAccount account = new BankAccount();

        assertThrows(IllegalArgumentException.class, () -> {
            bankService.deposit(account, -500);
        });

        assertEquals(0.0, account.getBalance());
        verify(notification, never()).send(anyString());
    }
}
