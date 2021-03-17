package array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {-325, 0, -500};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-500, -325, 0};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort7() {
        int[] data = new int[] {64, 85, -1, -89, 114, 1000, 3, 9000054};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-89, -1, 3, 64, 85, 114, 1000, 9000054};
        Assert.assertArrayEquals(expected, result);
    }
}