package mypack;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static junit.framework.TestCase.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalclatorDivideIntTest {
    Calculator c = new Calculator();
    //test for int method
    @Test
    public void test01DivideThrowsException() {
        boolean thrown = false;
        try {
            c.divide(6,0);
        } catch (Exception  e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
    @Test
    public void test02ASmaller(){
        double result = c.divide(2,6);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void test03BSmaller(){
        double result = c.divide(6,2);
        Assert.assertTrue(result == 3);
    }

    @Test
    public void test04AZero(){
        double result = c.divide(0.0,6.0);
        Assert.assertTrue(result == 0);
    }
}
