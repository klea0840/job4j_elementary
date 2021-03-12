package condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void way00To77() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 7;
        int y2 = 7;
        int expected = 7;
        int path = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, path);
    }

    @Test
    public void way26To41() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int expected = 0;
        int path = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertThat(path, is(expected));
    }

    @Test
    public void way26To51() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -5;
        int y2 = 1;
        int expected = -1;
        int path = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertThat(path, is(expected));
    }
}