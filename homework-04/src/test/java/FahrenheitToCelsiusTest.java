/**
 * Boundary values testing should be performed here
 */

import org.junit.Assert;
import org.junit.Test;

public class FahrenheitToCelsiusTest {

    FahrenheitToCelsius fToC = new FahrenheitToCelsius();


    @Test
    public void testHealthyLowerBoundary(){
        String message = null;
        int result=0;
        try {
            result = fToC.fToC(97);
        } catch (Exception e) {
            message = e.getMessage();
        }
        Assert.assertEquals(result, 36);
    }

    @Test
    public void testHealthyUpperBoundary(){
        String message = null;
        int result=0;
        try {
            result = fToC.fToC(100);
        } catch (Exception e) {
            message = e.getMessage();
        }
        Assert.assertEquals(result, 37);
    }

    @Test
    public void testInputZero(){
        String message = null;
        try {
            int result = fToC.fToC(0);
        } catch (Exception e) {
            message = e.getMessage();
        }
        Assert.assertNotNull(message);
    }


    @Test
    public void testIllLowerBoundary(){
        String message = null;
        try {
            int result = fToC.fToC(96);
        } catch (Exception e){
            message = e.getMessage();
        }
            Assert.assertNotNull(message);
    }

    @Test
    public void testIllUpperBoundary(){
        String message = null;
        try {
            int result = fToC.fToC(101);
        } catch (Exception e){
            message = e.getMessage();
        }
        Assert.assertNotNull(message);
    }
}
