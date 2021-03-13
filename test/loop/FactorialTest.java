package loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int factorial = Factorial.calc(n);
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 0;
        int factorial = Factorial.calc(n);
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}