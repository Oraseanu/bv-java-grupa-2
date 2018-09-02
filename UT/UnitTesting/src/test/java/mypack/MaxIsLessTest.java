package mypack;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static junit.framework.TestCase.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MaxIsLessTest {
    Max m = new Max();

    @Test
    public void Test01AIsLessThanB(){
        System.out.println("se ruleaza testul AIsLessThanB...");
        boolean result = m.isLess(5,3);
        Assert.assertEquals(result, false);
    }

    @Test
    public void Test02BIsLessThanA(){
        System.out.println("se ruleaza testul BIsLessThanA...");
        boolean result = m.isLess(3,5);
        Assert.assertEquals(result, true);
    }
    @Test
    public void Test03AIsEqualTOB(){
        System.out.println("se ruleaza testul AIsEqualTOB...");
        boolean result = m.isLess(3,3);
        Assert.assertEquals(result, false);
    }
}
