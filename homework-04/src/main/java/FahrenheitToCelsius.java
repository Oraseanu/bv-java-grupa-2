
/**
 * @author Daniel Oraseanu
 * this class has only one method that converts Fahrenheit degrees to Celsius degrees
 */
public class FahrenheitToCelsius {
    /**
     * @param fahrenheit temperature value in Fahrenheit degrees
     * @return correspondent value in Celsius degrees for the above parameter
     * @throws Exception if Celsius temperature value is higher than 37
     */
    public int fToC(int fahrenheit) throws Exception {
        int celsius = (fahrenheit - 32) * 5 / 9;
        if (celsius <= 37 && celsius >= 36){
            return celsius;
        } else {
            throw new Exception("" + celsius + ". You are ill");
        }
    }
}
