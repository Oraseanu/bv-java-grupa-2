import org.junit.Assert;
import org.junit.Test;

public class CalculateMaxTest {

    CalculateMax calculateMax = new CalculateMax();

    @Test
    public void testFirstBigger(){
        int result = calculateMax.getMax(5,-1);
        Assert.assertTrue(result == 5);
    }

    @Test
    public void testSecondBigger(){
        int result = calculateMax.getMax(0,8);
        Assert.assertTrue(result == 8);
    }

    @Test
    public void testBothEqual(){
        int result = calculateMax.getMax(0,0);
        Assert.assertTrue(result == 0);
    }
}
