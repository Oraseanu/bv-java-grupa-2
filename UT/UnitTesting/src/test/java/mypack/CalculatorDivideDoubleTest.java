package mypack;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static junit.framework.TestCase.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorDivideDoubleTest {
    Calculator c = new Calculator();



    //test for double method
    @Test
    public void test01DivideThrowsException() {
        double result = c.divide(2.0,0.0);
        Assert.assertTrue(result == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02ASmaller(){
        double result = c.divide(2.0,6.0);
        Assert.assertTrue(result == (double)2/6);
    }

    @Test
    public void test03BSmaller(){
        double result = c.divide(6.0,2.0);
        Assert.assertTrue(result == 3.0d);
    }

    @Test
    public void test04AZero(){
        double result = c.divide(0.0,6.0);
        Assert.assertTrue(result == 0);
    }

}
