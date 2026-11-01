
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ExchangeRateServiceTest {

    @Test
    void exchangeRateShouldReturnMockedValue() {
        ExchangeRateService exchangeRateService =
            mock(ExchangeRateService.class);

        when(exchangeRateService.getExchangeRate("EUR", "HUF"))
            .thenReturn(395.0);

        double rate = exchangeRateService.getExchangeRate("EUR", "HUF");

        assertEquals(395.0, rate);

        verify(exchangeRateService).getExchangeRate("EUR", "HUF");
    }
}
