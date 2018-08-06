package mypack;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static junit.framework.TestCase.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//MaxTest is a test case
public class MaxTest {
    Max m = new Max();

    @Test
    public void getMax01ABiggest(){
        System.out.println("se ruleaza testul ABiggest...");
        int result = m.getMax(5,3);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void getMax02BBiggest(){
        System.out.println("se ruleaza testul BBiggest...");
        int result = m.getMax(3,5);
        Assert.assertEquals(result, 5);
    }
    @Test
    public void getMax03Equal(){
        System.out.println("se ruleaza testul Equal...");
        int result = m.getMax(3,3);
        Assert.assertEquals(result, 3);
    }
}
