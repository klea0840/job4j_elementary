package condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void when122ThenTriangle() {

        double ab = 1;
        double bc = 2;
        double ac = 2;
        Assert.assertTrue(Triangle.exist(ab, bc, ac));
    }

    @Test
    public void when112ThenNoTriangle() {

        double ab = 1;
        double bc = 1;
        double ac = 2;
        Assert.assertFalse(Triangle.exist(ab, bc, ac));
    }
}