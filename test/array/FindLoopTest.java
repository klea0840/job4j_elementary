package array;
import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas15Then0() {
        int[] data = {5, 4, 15, 2};
        int el = 15;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas0ThenNo() {
        int[] data = {5, 4, 15, 2};
        int el = 0;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertNotEquals(expected, result);
    }
}