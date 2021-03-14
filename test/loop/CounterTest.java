package loop;
import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom15To30Then184() {
        int start = 15;
        int finish = 30;
        int result = Counter.sumByEven(start, finish);
        int expected = 184;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom38To46Then210() {
        int start = -22;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = -132;
        Assert.assertEquals(expected, result);
    }
}