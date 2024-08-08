
import org.junit.Assert;
import org.junit.Test;
import ru.netology.javaqa.CashbackHackService;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTestNG {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testNotItems() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
       assertEquals(expected,actual);
    }
    @Test
    public void testNormItems() {
        int amount = 483;
        int actual = service.remain(amount);
        int expected = 517;
        assertEquals(expected,actual);
    }
    @Test
    public void testLimitValueMax() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    public void testLimitValueMin() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);
    }
    @Test
    public void testSum1000() {
        int amount = 1000;
        int actual =service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void testMoreThanA1000() {
        int amount = 1001;
        int actual =service.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);
    }
}
