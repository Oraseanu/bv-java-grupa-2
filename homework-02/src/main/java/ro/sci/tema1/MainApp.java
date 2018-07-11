/**
 * Intro To Java Homework (homework of class 02)
 *
 * Validation Criteria:
 *     Respecting naming conventions
 *     JavaDOC
 *     Code compiles
 *     Main class and algorithm classes seperated
 *     IntelliJ Project archived as ZIP and uploaded to Moodle
 *         RAR/7ZIP not accepted
 *         Project in ZIP must be importable in IntelliJ
 *     Project Structure: see screenshot in Moodel.
 *
 * Documentation:
 *     The homework is based on 3 classes representing exercises that require as input:
 *       - one number (ExercisesWithOneNumber)
 *       - two numbers (ExercisesWithTwoNumbers)
 *       - more numbers (ExercisesWithACollection)
 *     At exercise 4. 34143 is set as program argument via IDE configuration
 *     Oraseanu Daniel
 */

package main.java.ro.sci.tema1;


public class MainApp {
    public static void main(String... args){
        ExercisesWithOneNumber exerciseN;
        ExercisesWithTwoNumbers exerciseMN;
        ExercisesWithACollection exerciseC;

        exerciseN = new ExercisesWithOneNumber();
        exerciseMN = new ExercisesWithTwoNumbers();
        exerciseC = new ExercisesWithACollection();

        System.out.println(
                "1. The sum of the first 100 numbers higher than 0 is: " + exerciseN.addNumbersUpTo(100) + "\n" +
                "2. The smallest number from a collections of numbers is: " + exerciseC.getSmallestOf(new int[] {5,12,8,4,0,-1,12,5,55,-7,100}) +
                    "; The numbers were: " + exerciseC.toString() + "\n" +
                "   (Problem: the max digit from the number.) Please type in a number:");
        exerciseN.readNumberFromKeyboard();
        System.out.println(
                "3. The max digit from the number you typed in is: " + exerciseN.getMaxDigitOfN() + "\n" +
                "4. Check if " + args[0] + " is palindrom: "+ exerciseN.isPalindrome(Integer.parseInt(args[0])) +
                    ". The number was passed in as parameter to main args" + "\n" +
                "5. Display all prime numbers lower than a number: " + exerciseN.displayAllPrimesLowerThan(11) +
                    "(the number was: " + exerciseN.getN() + ")\n" +
                "6. Input the dimensions of a rectangle and display area and perimeter: \n" +
                "   Area: " + exerciseMN.getRectangleAreaFom(6,4) + "(L = " + exerciseMN.getM() + ")/ (l = " + exerciseMN.getN() + ")\n" +
                "   Perimeter: " + exerciseMN.getRectanglePerimeterFom(6,4) + "(L = " + exerciseMN.getM() + ")/ (l = " + exerciseMN.getN() + ")"
        );
        try {
            System.out.print(
                "7. Input the length of the side of a square, and display its area.  Produce an error message if the length is negative:" +
                "   Area: " + exerciseN.getAreaOfSquareHavingSide(4) + " (Side = " + exerciseN.getN() + ")\n");
        } catch (IllegalArgumentException e) {
            e.getMessage();
            System.out.print("could not be calculated because length was negative.");
        }
        System.out.println(
                "8. Input 3 numbers, and display the biggest: " + exerciseC.getBigestOf(new int[] {5,12,8}) + "; The numbers were: " + exerciseC.toString() + "\n" +
                "9. Input 2 values:  start  and  finish, then display the numbers from start to finish:\n" +
                "   start to finish: " + exerciseMN.displayNumbersFromMToN(12,19) + "(start = " + exerciseMN.getM() + ") / (finish = " + exerciseMN.getN() + ")");
    }
}
