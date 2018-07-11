/**
 * Contains methods for exercises that use as input one number
 *
 * The number is passed in through methods which represent an exercise each. Then the methods to apply algorithms on that number
 * There are also helper methods at "Helper Methods"
 *
 * @field n number passed to the filed n
 */


package main.java.ro.sci.tema1;
import java.util.Scanner;

public class ExercisesWithOneNumber {
    private int n;

    /**
     * Constructors
     */

    public ExercisesWithOneNumber() { }

    /**
     * Getters & Setters
     */

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    /**
     * Helper methods
     */

    /**
     * Reads a number from keyboard and sets the n value to the read number
     */
    public void readNumberFromKeyboard(){
        Scanner keyboard = new Scanner(System.in);
        int myNumber = keyboard.nextInt();
        setN(myNumber);
    }

    /**
     *
     * @param n number to check if it has one digit or not
     * @return boolean value representing the answer
     */
    public static boolean hasOneDigit(int n){
        boolean answer = false;
        if ((n == 0) || ((n - n % 10) == 0)){
            answer = true;
        }
        return answer;
    }

    /**
     * Exercises start here:
     */

    /**
     *
     * @return the sum of the first n numbers.
     */
    public int addNumbersUpTo(int n){
        this.setN(n);
        int sum = 0;
        for(int i = 1; i <= this.n; i++){
            sum+=i;
        }
        return sum;
    }

    /**
     *
     * @return the digit with the biggest value from number n
     */
    public int getMaxDigitOfN(){
        int maxDigit = Integer.MIN_VALUE;
        if (hasOneDigit(this.n)) {
            maxDigit = this.n;
        } else {
            do {
                if ((this.n % 10) > maxDigit) {
                    maxDigit = this.n % 10;
                }
                this.n = this.n / 10;
            } while (n != 0);
        }
        return maxDigit;
    }

    /**
     *
     * @param number to be checked if is palindrome or not
     * @return true or false
     */
    public boolean isPalindrome(int number){
        boolean answer;
        int mirrorNumber = 0;
        int initialNumber = number;

        if(hasOneDigit(number)){
            answer = true;
        }

        do{
            mirrorNumber = mirrorNumber * 10 + number % 10;
            number = number / 10;
        } while (number != 0);
        answer = (initialNumber == mirrorNumber);

        return answer;
    }

    /**
     *
     * @param number up to which we show the prime numbers. this number is not to be invluded in the list
     * @return a string containing the prime numbers from 1 to number exclusively
     */
    public String displayAllPrimesLowerThan(int number) {
        boolean iPrime;
        this.setN(number);
        String primes = "";
        for (int i = 1; i < number; i++) {
            iPrime = true;
            for (int k = 2; k <= i / 2; k++) {
                if (i % k == 0)
                    iPrime = false;
            }
            if(iPrime) primes += i + " ";
        }
        return primes;
    }

    /**
     *
     * @param side of a square
     * @return area of the square
     * @throws IllegalArgumentException if side is negative
     */
    public int getAreaOfSquareHavingSide(int side) throws IllegalArgumentException{
        if (side < 0)
            throw new IllegalArgumentException("Negative values not permitted for the side of a square");
        this.setN(side);
        return side * side;
    }
}
