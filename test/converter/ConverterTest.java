package converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3USD() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert210euroThen14700Rub() {
        int in = 210;
        int expected = 14700;
        int out = Converter.euroToRub(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert210USDThen12600Rub() {
        int in = 210;
        int expected = 12600;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}