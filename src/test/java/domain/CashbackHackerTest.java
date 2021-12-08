package domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    void shouldCashOne() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void shouldCashTwo() {
        CashbackHacker service = new CashbackHacker();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    void shouldCashFree() {
        CashbackHacker service = new CashbackHacker();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void shouldCashFour() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void shouldCasFour() {
        CashbackHacker service = new CashbackHacker();
        int amount = 6000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}

