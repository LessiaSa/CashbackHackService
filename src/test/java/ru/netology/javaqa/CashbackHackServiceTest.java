package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    @Test
    public void testNotItems() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testNormItems() {
        CashbackHackService service = new CashbackHackService();
        int amount = 794;
        int expected = 206;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testLimitValueMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testLimitValueMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSum1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMoreThanA1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        Assertions.assertEquals(expected,actual);
    }
}
