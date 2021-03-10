package condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when35To24() {

            double expected = 1.4;
            int x1 = 3;
            int y1 = 5;
            int x2 = 2;
            int y2 = 4;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when98To04() {

        double expected = 9.85;
        int x1 = 9;
        int y1 = 8;
        int x2 = 0;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when98To105() {

        double expected = 23.02;
        int x1 = 9;
        int y1 = 8;
        int x2 = -10;
        int y2 = -5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}