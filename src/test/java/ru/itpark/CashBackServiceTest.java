package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void calculateCashback() {
        {
            CashBackService service = new CashBackService();
            int cashback = service.calculateCashback(0,0,0);
            assertEquals(0,cashback);
        }

        {
            CashBackService service = new CashBackService();
            int cashback = service.calculateCashback(1_000,0,0);
            assertEquals(10,cashback);
        }

        {
            CashBackService service = new CashBackService();
            int cashback = service.calculateCashback(0,1_000,0);
            assertEquals(50,cashback);
        }

        {
            CashBackService service = new CashBackService();
            int cashback = service.calculateCashback(0,0,1_000);
            assertEquals(300,cashback);
        }

        {
            CashBackService service = new CashBackService();
            int cashback = service.calculateCashback(9_900,58_000,0);
            assertEquals(2_999,cashback);
        }

        {
            CashBackService service = new CashBackService();
            int cashback = service.calculateCashback(0,0,30_000);
            assertEquals(3_000,cashback);
        }

        {
            CashBackService service = new CashBackService();
            int cashback = service.calculateCashback(0,10_000_000,0);
            assertEquals(3_000,cashback);
        }
    }

}