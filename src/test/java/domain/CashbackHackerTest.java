package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {

    CashbackHacker service = new CashbackHacker();

    @Test
    public void shouldCashOne() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashTwo() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashFree() {

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashFour() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCasFour() {

        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}

