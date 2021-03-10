package condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP4K1S1() {
        int expected = 1;
        int k = 1;
        int p = 4;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.1);
    }

    @Test
    public void whenP4K1S3() {
        int expected = 3;
        int k = 3;
        int p = 8;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.1);
    }

    @Test
    public void whenPK1S3() {
        double expected = 5.04;
        double k = 0.33;
        double p = 10.4;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.1);
    }
}