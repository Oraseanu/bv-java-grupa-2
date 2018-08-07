import org.junit.Assert;
import org.junit.Test;

public class DataValidationTest {

    DataValidation dataValidation = new DataValidation();

    @Test
    public void testWrongHours(){
        String result = dataValidation.timeIs("25","59");
        Assert.assertTrue(result == "Incorrect time!");
    }

    @Test
    public void testWrongMinutes(){
        String result = dataValidation.timeIs("05","60");
        Assert.assertTrue(result == "Incorrect time!");
    }

    @Test
    public void testValidTime(){
        String result = dataValidation.timeIs("05","00");
        Assert.assertTrue(result.equals("The time is 05:00 now."));
        //a string is not == to it's literal because the literal is actualy a new string and == checks references not values. So equals should be used.

    }


}
