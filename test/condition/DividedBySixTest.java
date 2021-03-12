package condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DividedBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DividedBySix.checkNumber(in);
        String expected = "The number can be divided by 6";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DividedBySix.checkNumber(in);
        String expected = "The number is not even, but can be divided by 3";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DividedBySix.checkNumber(in);
        String expected = "The number is even, but can't be divided by 3";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DividedBySix.checkNumber(in);
        String expected = "The number is not even and can't be divided by 3";
        Assert.assertEquals(expected, result);
    }
}