
/**
 * Contains methods for exercises that use as input two numbers
 *
 * The numbers are passed in through methods which represent an exercise each. Then the methods to apply algorithms on that number
 *
 *
 * @param n number passed to the filed n
 */


package main.java.ro.sci.tema1;

public class ExercisesWithTwoNumbers {
    private int m,n;

    /**
     * Constructors
     */

    public ExercisesWithTwoNumbers() {
    }

    /**
     * Getters & Setters
     */

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setMN(int m, int n) {
        this.m = m;
        this.n = n;
    }

    /**
     * Exercises start here:
     */

    /**
     *
     * @param length length of rectangle
     * @param width width of rectangle
     * @return Area of rectangle
     */
    public int getRectangleAreaFom(int length, int width){
         this.setMN(length,width);
         return length*width;
    }

    /**
     *
     * @param length length of rectangle
     * @param width width of rectangle
     * @return Perimeter of rectangle
     */
    public int getRectanglePerimeterFom(int length, int width){
        this.setMN(length,width);
        return 2 * length + 2 * width;
    }

    /**
     *
     * @param start starting number
     * @param finish ending number
     * @return a string containing all numbers from start to finish
     */
    public StringBuilder displayNumbersFromMToN(int start, int finish){
        this.setMN(start,finish);
        StringBuilder numbers = new StringBuilder();
        if (start < finish) {
            for (int i = start; i<= finish; i++)
                numbers.append(i + " ");
        } else {
            for (int i = start; i>= finish; i--)
                numbers.append(i + " ");
        }
        return numbers;
    }
}
