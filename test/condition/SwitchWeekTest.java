package condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class SwitchWeekTest {

    @Test
    public void ifDay3ThenW() {
        String expected = "Wednesday";
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void ifDay5ThenW() {
        String expected = "Wednesday";
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertNotEquals(expected, result);
    }
}