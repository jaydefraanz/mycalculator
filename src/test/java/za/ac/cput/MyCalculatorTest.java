package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class MyCalculatorTest
{
    private MyCalculator calc = new MyCalculator();

    @Test
    public void addition()
    {
        Assert.assertEquals(10,calc.add(5,5));
    }

    @Test
    public void multiply()
    {
        Assert.assertEquals(100, calc.multi(10, 10));
    }
}
